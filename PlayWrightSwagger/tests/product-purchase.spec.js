const { test, expect } = require('@playwright/test')
const { Login } = require('../pageObjects/Login')
const { Home } = require('../pageObjects/Home')

test("validate purchasing the order", async ({ page }) => {

    const productName = "Sauce Labs Onesie";
    const login = new Login(page);
    await login.goToLoginPage();
    await login.loginToSwagLabs();

    const home = new Home(page);
    await home.addToCart(productName);
    await home.goToShoppingCart();


    await page.locator(".inventory_item_name").waitFor();
      console.log(await page.locator(".inventory_item_name").textContent());
      await expect( page.locator(".inventory_item_name").textContent()).toContain(productName)
    //   await expect(page.locator(".inventory_item_name").textContent())

    await page.locator("#checkout").click();
    await page.getByPlaceholder("First Name").fill("Vikas")
    await page.getByPlaceholder("Last Name").fill("V")
    await page.getByPlaceholder("Zip/Postal Code").fill("57895");
    await page.locator("input[name='continue']").click();
    console.log(await page.locator(".inventory_item_name").textContent());
    // await expect(await page.locator(".inventory_item_name").textContent()).toContain(productName);
    await page.locator("button[name='finish']").click();

})