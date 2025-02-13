const {test, expect}=require('@playwright/test');
const { copyFileSync } = require('fs');


//to run the tests in parallel mode in the same file
test.describe.configure({mode:'parallel'})

test('Validate the title of the page',async ({browser})=>{

    const context= await browser.newContext(); //creates a new browser instance
    const page =await context.newPage(); //in that instance, the page is created
    //the above steps can be otimised by providing only the page fixture and call page fixture directly.
    await page.goto("https://the-internet.herokuapp.com/");
    console.log(await page.title());
    await expect(page).toHaveTitle("The Internet");
})

test.only('Validate the Add/Remove Elements screen ', async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/");
    await page.locator("a[href='/add_remove_elements/']").click();
    console.log(await page.locator("h3").textContent())
    expect(await page.locator("h3").textContent()).toContain("Add/Remove Elements");
    const numAddEleTObeClicked=4
    for(let i=0;i<=numAddEleTObeClicked;i++){
        await page.locator("[onclick='addElement()']").click();
    }

    let deleteBtnItems=await page.locator("[onclick='deleteElement()']").allTextContents();
    // let size= deleteBtnItems.length;
    // console.log(size)
    let numDeleteBtnCount = deleteBtnItems.length-1;
    console.log(numDeleteBtnCount)
    await expect(numAddEleTObeClicked).toBeLessThanOrEqual(numDeleteBtnCount)
})

test('Ui test login page', async ({page})=>{

   await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
   await page.locator("[id='username']").fill("rahulshettyacademy");
   await page.locator("[id='password']").fill("learning");
   await page.locator(".radiotextsty").last().check();
   await page.locator("button[id='okayBtn']").click();
   await expect(page.locator(".radiotextsty").last()).toBeChecked();
   const dropDown = await page.locator("select[class='form-control']");
   await dropDown.selectOption("Consultant");
   await page.locator("[id='terms']").check();
   await expect(page.locator("[id='terms']")).toBeChecked();
   await page.locator("[id='terms']").uncheck();
   expect(await page.locator("[id='terms']").isChecked()).toBeFalsy();
   await page.locator("[id='terms']").check();
   await page.locator("[name='signin']").click();
})

test('Validate the child windows..!!!',async ({browser})=>{

    const context=await browser.newContext();
    const page=await context.newPage();
    await page.goto("https://rahulshettyacademy.com/loginpagePractise/#");
    const documentLink= page.locator("[href*='documents-request']");

    const [newPage]=await Promise.all([
        context.waitForEvent('page'),
        documentLink.click(),
    ]);
      let redText = await newPage.locator(".red").textContent();
      let textSplit=redText.split(" ");
      let emailId = textSplit[4];
      console.log(emailId);
      await page.locator("[id='username']").fill(emailId);
      await page.locator("[id='password']").fill("learning");

})

test('Validate the hidden element',async ({page})=>{

    await page.goto("https://rahulshettyacademy.com/AutomationPractice/");
    await expect(page.locator("#displayed-text")).toBeVisible();
    await page.locator("#hide-textbox").click();
    await expect(page.locator("#displayed-text")).toBeHidden();
    await page.on('dialog',dialog => dialog.accept());
    await page.locator("[value='Alert']").click();
    await page.locator("#mousehover").hover();

    const frame = await page.frameLocator("#courses-iframe");
    await frame.locator("li a[href='lifetime-access']:visible").click();
    const frameTexts =await frame.locator(".text h2").textContent();
    const numOfSub = frameTexts.split(" ")[1];
console.log(numOfSub)
    
})