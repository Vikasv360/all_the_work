let nums=[2,4,5,6,7,8]

const num =nums.reduce((acc,num)=>acc+num,0)
console.log(num)

console.log("**************************")

let top = [10,23,34,8,21,15]

const topNew = top.reduce((max,num) =>{
if(num > max){
    return num
}
else{
    return max;
}

},top[0])

console.log(topNew)