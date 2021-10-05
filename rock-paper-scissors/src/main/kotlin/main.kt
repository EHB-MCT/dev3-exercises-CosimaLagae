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

fun getUserChoice(options: Array<String>){

}