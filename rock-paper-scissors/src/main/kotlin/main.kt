/*fun main(){
    val names = arrayOf("rock", "paper", "scissor",)
    val randomElement = names.random()    // here we can use the selected element to print it for example
    println(randomElement)
}*/

import java.util.Scanner

fun main(args: Array<String>) {
    val names = arrayOf("rock", "paper", "scissor",)
    val randomElement = names.random()    // here we can use the selected element to print it for example
    println(randomElement)


    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter your choice: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("my choice: $randomElement")
}


//part2
fun getUserChoice(options: Array<String>){

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