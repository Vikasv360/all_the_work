const user ={
    name: "vikas",
    age: 26,
    country:"India",
    occupation: "Engineer"
}

console.log(user.name + " : " + user.age + " : " + user.country+ " : " + user.occupation )

//constructor func

function Car(brand, model, price){
this.brand =brand;
this.model =model;
this.price =price;
}
const c1=new Car("Mahindra","Thar",1000000)
const c2=new Car("Tata","Altroz",1200000)

console.log(c1.brand + " : " + c1.model + " : " + c1.price)
console.log(c2.brand + " : " + c2.model + " : " + c2.price)

//3. Class

class Customer{

    constructor(Cust_name,product){
        this.Cust_name =Cust_name;
        this.product=product;
    }

    addToCart(){
        console.log("Add to cart")
    }
}

const cust1 = new Customer("Vikas","iPhone");
console.log(cust1.Cust_name)
console.log(cust1.product)