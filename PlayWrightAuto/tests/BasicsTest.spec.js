const { test, expect} = require('@playwright/test'); //This the initial import for running the playwright test

//JavaScript is asynchronous in nature, Does not run in sequence

test.only('Browser Playwright test', async ({ browser }) => {

    //Using browser fixture 
    //Chrome - plugin/cookiesr4
    const context = await browser.newContext();
    //to create a fresh page
    const page = await context.newPage();
    //navigate to the URL
    await page.goto("https://www.saucedemo.com/");
    console.log(await page.title());
     await expect(page).toHaveTitle("Swag Labs");
    //Playwright deals with css selector/xpath
    //Method to sendkeys we use 'fill'
    await page.locator("[id='user-name']").fill("standard_user");
    await page.locator("[type='password']").fill(""); //secret_sauce
    await page.locator("[id='login-button']").click();
    console.log(await page.locator("[class*='error-message']").textContent());

});


// test('Page Playwright test', async ({ page }) => {

//     //Using page fixture
//     await page.goto("https://the-internet.herokuapp.com/");
//     console.log(await page.title());
//     await expect(page).toHaveTitle("The Internet");
    
// });