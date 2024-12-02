const changeBgRed = () => {
    document.body.firstElementChild.style.background = "red"
  }
  changeBgRed();
  let b = document.body
  console.log("First child of b is: ", b.firstChild)
  console.log("First Element child of b is: ", b.firstElementChild)