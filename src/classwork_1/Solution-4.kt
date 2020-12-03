package classwork_1

fun main(){
    println("Enter your monthly salary")
    val sal= readLine()!!.toInt()
    val yrsal=sal*12

    when{
        yrsal > 200000 -> println("You hae to pay tax")
        else -> println("You don't have to pay tax")
    }
}