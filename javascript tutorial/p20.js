// let arr = [45, 24, 21]
// let a = arr.map((value, index, arr) => {
//     console.log(value, index, arr)
//     return value
// })
// console.log(a)

// let arr = [45, 24, 21]
// let a = arr.map((value, index, arr) => {
//     console.log(value, index, arr)
//     return value + index
// })
// console.log(a)

// Array filter method
// let arr2 = [45, 24, 21, 1, 7, 5]
// let a2 = arr2.filter((a) => {
//     return a < 10
// })
// console.log(a2)
// console.log(arr2)

let arr3 = [1, 2, 3, 4, 5, 6]
const reduce_fund = (h1, h2) =>{
    return h1 + h2
}
let newarr3 = arr3.reduce(reduce_fund)
console.log(newarr3)