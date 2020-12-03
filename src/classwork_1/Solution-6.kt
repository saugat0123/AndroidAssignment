package classwork_1

fun main() {
    println("Enter any number from 1 to 7")
    var num = readLine()!!.toInt()

    when{
        num ==1 -> println("Sunday")
        num ==2 -> println("Monday")
        num ==3 -> println("Tuesday")
        num ==4 -> println("Wednesday")
        num ==5 -> println("Thursday")
        num ==6 -> println("Friday")
        num ==7 -> println("Saturday")
    }
}