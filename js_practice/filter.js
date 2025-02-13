let nums= [2,4,5,6,7,10,324]

let newArray = nums.filter((e)=>e%2===0);

console.log(newArray)

console.log("************************************")

let employee=[
    {name:"Vikas",age:26,gender:"male"},
    {name:"Vikranth",age:32,gender:"male"},
    {name:"Bindu",age:24,gender:"female"},
    {name:"Vanitha",age:46,gender:"female"},
]

let femaleEmp = employee.filter((emp)=>{
    return emp.gender === "female" && emp.age > 25;
})
console.log(femaleEmp)