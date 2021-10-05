fun main(args: Array<String>) {
    val names = arrayOf("rock", "paper", "scissor",)
    val computerChoice = names.random()    // here we can use the selected element to print it for example


    println("your choice: ")
    val userChoice = readLine()!!
    println(computerChoice)
    determineWinner(computerChoice, userChoice)
    println("computer choice was: $computerChoice")
}


fun determineWinner(computerChoice: String, userChoice: String?){
    if (computerChoice == userChoice){
        println("it's a draw")
        return
    }

    val winMessage = "you've won"
    val loseMessage = "you've lost"

    when (computerChoice) {
        "rock" -> if (userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissor") println(winMessage) else println(loseMessage)
        "scissor" -> if (userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}