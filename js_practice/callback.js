
function greet(name, callback){
    console.log("Hello " + name)
    callback();
}

function welcome(){
    console.log("Welcome...!!!")
}

greet("Vikas",welcome)

console.log("*****************************")

//function with async

function printInfo(name, callback){

    setTimeout(function(){
        console.log("Printing info for " + name);
        callback("Plzzz call me back...!!!");
    },1000);
}

function displayMsg(msg){
    console.log(msg);
}

printInfo("Vikas",displayMsg)