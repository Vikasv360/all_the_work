const { test, expect } = require('@playwright/test')

// test.beforeEach("Go to the URL", async ({ page }) => {

//     await page.goto("https://the-internet.herokuapp.com/")
// })

test("Validate the functionality of add_remove elements screen", async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/")
    await page.locator("[href='/add_remove_elements/']").click();

    const numClicks = 4;
    for (let i = 1; i <= numClicks; i++) {
        await page.locator("button[onclick='addElement()']").click();
    }

    const deleteElementBtns = await page.locator("button[onclick='deleteElement()']").count();
    expect(numClicks).toBe(deleteElementBtns);

})

test("@web Validate Basic auth alert popup", async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/")
    await page.locator("[href='/basic_auth']").click();

    await page.on('dialog', dialog => dialog.dismiss());

    console.log(await page.locator("body").textContent())

});

test("@web Validate the checkboxes", async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/")
    await page.locator("[href='/checkboxes']").click();
    expect(await page.locator("[type='checkbox']").last().isChecked()).toBeTruthy();
    await page.locator("[type='checkbox']").first().click();
    expect(await page.locator("[type='checkbox']").first().isChecked()).toBeTruthy();

});

test("Validate navigating to another window", async ({ browser }) => {
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto("https://the-internet.herokuapp.com/");
    await page.locator("[href='/windows']").click();
    await page.locator("[href='/windows/new']").click();

    const page1 = await context.waitForEvent('page');
    console.log(await page1.locator("h3").textContent());
})




