const { test, expect } = require('@playwright/test')

test.only("Using playwirght page fixture", async ({ page }) => {

    await page.goto("https://www.saucedemo.com/");
    console.log(await page.title())
    await expect(page).toHaveTitle("Swag Labs");
    await page.locator("[id='user-name']").fill("standard_user");
    await page.locator("input[id='password']").fill("secret_sauce");
    await page.locator("#login-button").click();
    // console.log(await page.locator("[data-test='inventory-item-name']").first().textContent());
    // console.log(await page.locator("[data-test='inventory-item-name']").nth(1).textContent());
    
    //This is used when the webapplication is based on the service calls, wait till all the network calls are made,
    await page.waitForLoadState('networkidle') 
    await page.locator("[data-test='inventory-item-name']").first().waitFor(); //waits only when we have only one element
    console.log(await page.locator("[data-test='inventory-item-name']").allTextContents());
    

})