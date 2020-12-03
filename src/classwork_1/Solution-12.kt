package classwork_1

fun main(){
    println("Enter a number")
    var num= readLine()!!.toInt()

    for (i:Int in 1..10){
        println("$num * $i = ${num*i}")
    }
}