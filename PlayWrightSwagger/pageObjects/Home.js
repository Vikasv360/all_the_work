class Home {

    constructor(page) {
        this.productCards = page.locator(".inventory_item");
        this.shoppingCartLink = page.locator(".shopping_cart_link");
    }


    async addToCart(productName) {
        const count = await this.productCards.count();
        console.log(count);
        for (let i = 0; i < count; i++) {

            const txt = await this.productCards.locator(".inventory_item_name").nth(i).textContent();
            console.log(txt);
            if (txt.trim() === productName.trim()) {
                await this.productCards.locator("//button[text()='Add to cart']").nth(i).click();
            }

        }

    }

    async goToShoppingCart() {
        await this.shoppingCartLink.click();
    }

}
module.exports={Home}