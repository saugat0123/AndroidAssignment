package classwork_1

fun main() {
    println("Enter any single digit number")
    var num = readLine()!!.toInt()

    when{
        num ==0 -> println("Zero")
        num ==1 -> println("One")
        num ==2 -> println("Two")
        num ==3 -> println("Three")
        num ==4 -> println("Four")
        num ==5 -> println("Five")
        num ==6 -> println("Six")
        num ==7 -> println("Seven")
        num ==8 -> println("Eight")
        num ==9 -> println("Nine")
    }
}