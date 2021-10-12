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
    println(" ")
    println("welcome to Challenge Two")
    println("You need to guess which number the dice will stop on")
    println("pick: low (1-3) or high (4-6)")

    val userAnswer = readLine()
    val diceNumber = (1..6).random()

    if (userAnswer == "low") {
        val diceNum = if (diceNumber > 3) high else low
    } else {
        
    }

    val low = arrayOf(1,2,3)
    val high = arrayOf(4,5,6)

    val diceNumber = (1..6).random()

    /*when (diceNumber) {
        1,2,3 -> if (userAnswer == low)
    }*/
}


fun challengeThree(){
    println(" ")
    println("welcome to Challenge Three")
    println("You need to choose your object of choice, if you choose the wrong one, you will be redirected")
    println("objects: a flower, the sun or a tree")




}
fun gameOver(){
 println("Game Over")
}