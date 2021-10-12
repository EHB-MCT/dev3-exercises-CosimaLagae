fun main() {
    println("welcome to the climate game")
    challengeOne()
}

fun challengeOne(){
    println("In the first challenge you need to solve my riddle.")
    println("my riddle is:")
    println("How many colors does the rainbow have?")

    val correctAnswer = setOf<String>("7")

    val userAnswer = readLine()
        if(correctAnswer.contains(userAnswer)) {
            println("succeeded! Go to Challenge Two")
            challengeTwo()
        } else {
            gameOver()
        }
}

fun challengeTwo(){

}

fun gameOver(){
 println("Game Over")
}