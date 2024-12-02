let marks = {
    sameer : 98,
    manish : 98,
    karuna : 70
}
// for (let i = 0; i < Object.keys(marks).length; i++) {
//     const element = Object.keys(marks)[i];
//     const m = marks[Object.keys(marks)[i]]
//     console.log(element, "" , m)
// }

for (const key in marks) {
    console.log(key, "", marks[key])
}