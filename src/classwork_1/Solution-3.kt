package classwork_1

fun main(){
    println("Enter a number")
    var num= readLine()!!.toFloat()

    when {
        num < 0.0 -> println("$num is a negative number")
        num > 0.0 -> println("$num is a positive number")
        else -> println("$num is zero")
    }
}