const { test } = require('@playwright/test')

test("Validate special locators of playwright", async ({ page }) => {
    await page.goto("https://rahulshettyacademy.com/angularpractice/");
    await page.getByLabel("Check me out if you Love IceCreams!").click();
    await page.getByLabel("Employed").click();
    await page.getByLabel("Gender").selectOption("Female");
    await page.getByPlaceholder("Password").fill("Vikas@123");
    await page.getByRole("button", { name: 'Submit' }).click();
    await page.getByText("Success! The Form has been submitted successfully!.").isVisible();
    await page.getByRole("link", { name: "Shop" }).click();
    await page.locator("app-card").filter({ hasText: "Nokia Edge" }).getByRole("button").click();
    await page.getByText("Checkout").click();
})

test.only('Work with calendars', async ({ browser }) => {

    const monthNum = "6";
    const year = "2025";
    const date = "19";
    const context = await browser.newContext();
    const page = await context.newPage();
    await page.goto("https://rahulshettyacademy.com/seleniumPractise/#/");
    await page.waitForLoadState("networkidle")
    await page.getByRole("link", { name: "Top Deals" }).click();
    const page1 = await context.waitForEvent('page');
    await page1.locator(".react-date-picker__inputGroup").click();
    await page1.locator(".react-calendar__navigation__label__labelText").click();
    await page1.locator(".react-calendar__year-view__months__month").nth(Number(monthNum)-1).click();
    await page1.locator("//abbr[text()='"+date+"']").click();
    await page1.pause();
})