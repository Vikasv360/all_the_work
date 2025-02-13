class Login{
    constructor(page){

        this.page = page;
        this.username = page.locator("[id='user-name']");
        this.password = page.locator("input[id='password']");
        this.signinBtn = page.locator("#login-button");

    }

    async goToLoginPage(){

       await this.page.goto("https://www.saucedemo.com/");

    }

    async loginToSwag(){
        await this.username.fill("standard_user");
        await this.password.fill("secret_sauce");
        await this.signinBtn.click();
    }

}
module.exports={Login}