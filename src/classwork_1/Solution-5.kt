package classwork_1

fun main(){
    println("Enter your age")
    val age= readLine()!!.toInt()

    when{
        age <= 0 -> println("Invalid input")
        age in 1..5 -> println("Infant")
        age in 6..10 -> println("Child")
        age > 10 -> println("Adult")
    }
}