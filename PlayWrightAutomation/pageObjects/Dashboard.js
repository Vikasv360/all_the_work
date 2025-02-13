class Dashboard {

    constructor(page) {

        this.productCards = page.locator(".inventory_item");
        this.shoppingLink = page.locator(".shopping_cart_link");
    }

    async addItemToCart() 
    {

        const count = await this.productCards.count();
        console.log(count)
        for (let i = 0; i < count; i++) {

            const txt = await productCards.locator(".inventory_item_name ").nth(i).textContent();
            console.log(txt);
            if (txt.trim() === productName.trim()) {
                await productCards.locator("//button[text()='Add to cart']").nth(i).click();
            }

        }

    }

    async goToShoppingCart(){
        await this.shoppingLink.click()
    }

}
module.exports = { Dashboard }