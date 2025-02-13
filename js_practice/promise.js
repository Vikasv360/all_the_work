const myProm=new Promise((resolve,reject)=>{
setTimeout(()=>{

    const randomValue = Math.random();

    if(randomValue > 0.01){
resolve(randomValue);
    }
    else{
reject(new Error("Value is too small..!!"))
    }

},2000)

});

myProm.then(result=>{
 console.log("promise is fulfilled with value: " + result)
}).then(error=>{
    console.error("promise is reject with value : " + error)
})