let id1 = document.getElementById("id1")
console.log(id1)
// // console.log(id2) // throw this we can select the elemnent but it not a good way
let sp1 = document.getElementById("sp1")
console.log(sp1)
let sp = document.getElementsByTagName("span")
console.log(sp)


console.log(id1.matches(".class"))// false
console.log(id1.matches(".box"))// true
console.log(sp1.closest("#sp1"))
console.log(id1.contains(sp1))
console.log(sp1.contains(sp1))
console.log(sp1.contains(id1))
// let id1 = document.getElementById("id1")
// let sp1 = document.getElementById("sp1")
// console.log(sp1)
// console.log(id1.matches(".class"))
// console.log(id1.matches(".box"))
// console.log(sp1.closest("#sp1"))
// console.log(id1.contains(sp1))
// console.log(sp1.contains(sp1))
// console.log(sp1.contains(id1))