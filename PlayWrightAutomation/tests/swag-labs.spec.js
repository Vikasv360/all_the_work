const { test, expect } = require('@playwright/test')

test("validate purchasing the order", async ({page}) => {

    const productName = "Sauce Labs Onesie";
    await page.goto("https://www.saucedemo.com/")
    await expect(page).toHaveTitle("Swag Labs");
    await page.locator("[id='user-name']").fill("standard_user");
    await page.locator("input[id='password']").fill("secret_sauce");
    await page.locator("#login-button").click();
    const productCards = await page.locator(".inventory_item");
    const count = await productCards.count();
    console.log(count)
    for (let i = 0; i < count; i++) {

        const txt = await productCards.locator(".inventory_item_name").nth(i).textContent();
        console.log(txt);
        if (txt.trim() === productName.trim()) {
            await productCards.locator("//button[text()='Add to cart']").nth(i).click();
        }

    }

    await page.locator(".shopping_cart_link").click();
    expect(await page.locator(".inventory_item_name").textContent()).toContain(productName);
 
    await page.locator("#checkout").click();
    await page.getByPlaceholder("First Name").fill("Vikas")
    await page.getByPlaceholder("Last Name").fill("V")
    await page.getByPlaceholder("Zip/Postal Code").fill("57895");
    await page.locator("input[name='continue']").click();
    expect(await page.locator(".inventory_item_name").textContent()).toContain(productName);
    await page.locator("button[name='finish']").click();

})