//with parameter
function add(a,b){
    return a+b;
}

console.log(add(4,5));
console.log("***************************************");

//without parameter

function print(){
    console.log("Hi Vikas")
}
print();
console.log("***************************************");

//expression

const cy=function(x,y){
    return x+y;
}

console.log(cy(4,5))
console.log("***************************************");

//arrow function:

const div = (a,b)=>a/b;
console.log(div(20,2))
console.log("***************************************");
//recurrsive function

function fact(n){
    if(n===0 || n===1){
        return 1;
    }
    else{
        return n* fact(n-1)
    }
}

console.log(fact(4))