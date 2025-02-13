import{test,expect} from '@playwright/test'
import { btoa } from 'buffer';


test('Validate the authorization popup', async ({page})=>{

    const userName = "admin";
    const password = "admin";
    const authHeader = 'Basic '+btoa(userName+':'+password);

    await page.setExtraHTTPHeaders({Authorization : authHeader});
    await page.goto("https://the-internet.herokuapp.com/basic_auth");
    expect(await page.locator("div[class='example'] p")).toBeVisible();
    const successMsg=await page.locator("div[class='example'] p").textContent();
    console.log(successMsg);
})