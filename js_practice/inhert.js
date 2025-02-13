class Vehicle{

    constructor(make,model,year){
        this.make =make;
        this.model =model;
        this.year =year;

    }


getInfo(){
    console.log(this.make + " : " + this.model + " : " +this.year);
}

    startEngine(){
        console.log(this.model + " is starting the engine")
    }

    stopEngine(){
        console.log(this.model + " is stopping the engine")
    }
}

class car extends Vehicle{

    constructor(make,model,year,fuelType){
        super(make,model,year)
        this.fuelType=fuelType;
    }

    driveCar(){
        console.log("Driving the car" + this.model)
    }
}

const car1 =new car("Tata","Altroz","2023","Petrol");
console.log(car1.make + " : " + car1.model + " : " + car1.year + " : " + car1.fuelType)

