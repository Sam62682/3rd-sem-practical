const promp=require("prompt-sync")();
let number = Math.floor((Math.random() * 100) + 1)
console.log(number)
let chances = 0
while (chances <= 10) {
    let a = promp("Enter a number : ")
    let guess_number = parseInt(a)
    if (guess_number < number) {
        console.log("Your guess number is less then to number")
    }
    else if (guess_number > number) {
        console.log("Your guess number is greater then to number")
    }
    else
    {
        console.log("Congratulation You win this game")
        console.log(`You win this game in ${chances} chance`)
        break
    }
    chances += 1;
    console.log(`Remain Your chances ${10 - chances}`)
}
