const {test} = require('@playwright/test')

test('Validate the Recruitment features of HRM', async ({page})=>{


    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    await page.locator("[name='username']").fill("Admin");
    await page.locator("[name='password']").fill("admin123");
    await page.locator("button[type='submit']").click();
    await page.locator("span[class*='oxd-main-menu-item--name']").first();
    await page.locator("text=Recruitment").click();
    await page.locator("[class*='oxd-button-icon']").click();
    await page.locator("[class*='orangehrm-firstname']").fill("Vikas");
    await page.getByPlaceholder("Last Name").fill("V");
    await page.locator("[class*='oxd-select-text--active']").click();
    const vacancyList=await page.locator("div[role='listbox']").allTextContents();
    const vacancyRoleCount= await page.locator("div[role='listbox']").count();

    for(let i=0;i<vacancyRoleCount;i++){

        if(vacancyList.includes("Senior QA Lead")){
          
            await page.locator("div[role='listbox']").nth(i).getAttribute("button").click();
            break;
        }
        
        
    }
    await page.getByPlaceholder("Type here").first().fill("vikas@test.com");
    await page.pause();
    


})