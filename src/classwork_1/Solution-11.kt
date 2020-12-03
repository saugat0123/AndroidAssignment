package classwork_1

fun main(){
    println("Enter first number")
    var first= readLine()!!.toInt()
    println("Enter second number")
    var second= readLine()!!.toInt()
    var sum=0

    for (i:Int in first..second){
        if (i % 2 == 0){
            sum += i
        }
    }
    println("The sum of even numbers between $first & $second is $sum")
}