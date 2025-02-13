const{test,expect}=require('@playwright/test')

test('Using playwirght browser fixture', async ({ browser }) => {

    //If we want browser context/ browser cookies

    //playwright fixture are the global variables, browser, page
    //to create a new browser instance

    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto("https://www.saucedemo.com/");
    console.log(await page.title())
    await expect(page).toHaveTitle("Swag Labs");
});

test("Validate login with valid credential", async ({ page }) => {

    await page.goto("https://www.saucedemo.com/");
    console.log(await page.title())
    await expect(page).toHaveTitle("Swag Labs");
    await page.locator("[id='user-name']").fill("standard_user");
    await page.locator("input[id='password']").fill("secret_sauce");
    await page.locator("#login-button").click();
   

});

test("Validate login with invalid credential", async ({ page }) => {

    await page.goto("https://www.saucedemo.com/");
    console.log(await page.title())
    await expect(page).toHaveTitle("Swag Labs");
    await page.locator("[id='user-name']").fill("standard_user");
    await page.locator("input[id='password']").fill("secret");
    await page.locator("#login-button").click();
    await expect(page.locator("[data-test='error']")).toContainText("Epic sadface: Username and password do not match any user in this service");

});