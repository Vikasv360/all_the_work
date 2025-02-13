import{test,Page,expect,Locator} from '@playwright/test'

test('Validate the browser context',async ({browser})=>{

    //BrowserContext 1:
    const browser1=await browser.newContext();
    const page1:Page = await browser1.newPage();

      //BrowserContext 2:
      const browser2=await browser.newContext();
      const page2:Page = await browser2.newPage();

    //Browser 1
    await page1.goto("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    const email1: Locator = page1.locator("input[name='email']");
    const password1: Locator = page1.locator("#input-password");
    const loginBtn1: Locator = page1.locator("[value='Login']");
    await email1.fill("vikasTest123@Test.com");
    await password1.fill("Test@123");
    await loginBtn1.click();
    const titleName1 = await page1.title();
    console.log("Title name : " + titleName1);
    expect(titleName1).toEqual('My Account');
    await browser1.close();



     //Browser 2
     await page2.goto("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
     const email: Locator = page2.locator("input[name='email']");
     const password: Locator = page2.locator("#input-password");
     const loginBtn: Locator = page2.locator("[value='Login']");
     await email.fill("Admin@test.com");
     await password.fill("Test@1234");
     await loginBtn.click();
     const titleName = await page2.title();
     console.log("Title name : " + titleName);
     expect(titleName).toEqual('My Account');
     await browser2.close();
     
 

})