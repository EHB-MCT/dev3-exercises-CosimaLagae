fun main() {
    println("welcome to the climate game")
    challengeOne()
}

fun challengeOne(){
    println("In the first challenge you need to solve my riddle.")
    println("my riddle is:")
    println("What does the weatherman always say to a leprechaun?")

    val correctAnswer = setOf<String>("How's the weather down there?")

    val userAnswer = readLine()
        if(correctAnswer.contains(userAnswer)) {
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