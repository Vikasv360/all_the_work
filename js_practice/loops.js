for(let i=0;i<5;i++){
    console.log(i)
}


const array=[1,2,3,4,5];

for(const e in array){
    console.log(array[e])
}

for(const e of array){
    console.log(e)
}

for(let i=0;i<array.length;i++){
    console.log(array[i])
}

console.log("*************************************")

let p=1;
while(p<=10){
    console.log(p)
    p++;
}

console.log("*************************************")

 let h=1;

 do{

    console.log(h)
    h++
 }
 while(h<=10)

console.log("*************************************")

const browser = ["chrome","firefox","edge"]

for(const e of browser){
    if(e == "edge"){
        console.log("launch edge browser...!!!")
        break;
    }
}

console.log("*************************************")

//objects 
const user={

    name : "Vikas",
    age:26,
    city: "Bengaluru"
}

for(const key in user){
    console.log(key + " : " + user[key])
}