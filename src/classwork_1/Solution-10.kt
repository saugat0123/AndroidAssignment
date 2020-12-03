package classwork_1

fun main(){
    println("Enter first number")
    var first= readLine()!!.toInt()
    println("Enter second number")
    var second= readLine()!!.toInt()
    println("The even numbers between $first & $second are show below")
    for (i:Int in first..second){
        if (i % 2 == 1){
            println (i)
        }

    }
}