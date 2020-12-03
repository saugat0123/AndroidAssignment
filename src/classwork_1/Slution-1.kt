package classwork_1

fun main(){
    println("Enter a number")
    val num= readLine()!!.toInt()

    if (num > 100)
    {
        println("$num is greater than 100 ")
    }
    else
    {
        println("$num is smaller than 100")
    }
}