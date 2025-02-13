let nums=[2,3,4,5,6]

let mapNums =nums.map((e)=>e*2);
console.log(mapNums)
console.log("****************************************")

let fahTemp =[32,68,86,104,212]

function fahToCel(fah){
    return (fah - 32 ) * (5/9);
}

let temp =fahTemp.map(fahToCel)
console.log(temp)

console.log("****************************************")