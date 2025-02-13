let myArray=[];

let lang=["java","python","JS"];

//1.push : adds at the end of the array
lang.push("kotlin")
console.log(lang)

//2.pop
lang.pop()
console.log(lang)

//3.shift: it will remove the first element and returns the first element
let fruits =["apple","banana","orange"]
let fistfruit = fruits.shift();
console.log(fistfruit)

//4. unshift: adds first element in the array
let colors = ["blue","red","green","yellow"]
colors.unshift("voilet")
console.log(colors)
console.log(colors.length)

//splice
let animals =["lion","tiger","bear","fish"]

animals.splice(1,2,"cat","dog")
console.log(animals)

//slice:
let pop =[1,2,3,4,5]

let newPop = pop.slice(1,4)
console.log(newPop)

//concat:
let fr=["eat","run","jump"]
let num=[1,2,3]
let mixedArr = fr.concat(num)
console.log(mixedArr)

//foreach: loop

let n =[1,2,3,4,5]
n.forEach((e)=>{
    console.log(e*2)
})