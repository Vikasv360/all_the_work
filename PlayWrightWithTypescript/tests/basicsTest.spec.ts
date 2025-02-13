import {test,Page,expect,Locator} from '@playwright/test'


test('Validate login page',async ({page})=>{

    await page.goto("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    const email: Locator = page.locator("input[name='email']");
    const password: Locator = page.locator("#input-password");
    const loginBtn: Locator = page.locator("[value='Login']");

    await email.fill("vikasTest123@Test.com");
    await password.fill("Test@123");
    await loginBtn.click();

    const titleName = await page.title();
    console.log("Title name : " + titleName);

    // Verify that the title matches the expected title
    expect(titleName).toEqual('My Account');

    await page.close();

})