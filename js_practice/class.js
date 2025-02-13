class Bike{

    constructor(brand,model,price,capcity){
        this.brand =brand;
        this.model =model;
        this.price =price;
        this.capcity =capcity;
    }

    refuel(){
        console.log(this.model + " Refuel the Bike")
    }

}

const b1=new Bike("Royal Enfield","Scram 411","3Lakhs","411cc");
const b2=new Bike("Hero","xpulse 200v","2.75Lakhs","200cc");
console.log(b1.brand + " : " + b1.model + " : " + b1.price + " : " + b1.capcity);
b1.refuel();
console.log(b2.brand + " : " + b2.model + " : " + b2.price + " : " + b2.capcity);
b2.refuel();