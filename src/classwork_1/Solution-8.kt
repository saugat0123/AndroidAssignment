package classwork_1

fun main(){
    println("Enter your monthly salary")
    var sal= readLine()!!.toInt() * 12
    println("Your annual salary is $sal")
    calc(sal)
    println("The tax is $sal")
}

fun calc(num: Int):Int {
    return when {
        num in 1..200000 -> {
            (1/100) * num
        }
        num in 200000..350000 -> {
            ((1/100)*200000 + (15/100)*(num-200000))
        }
        num > 350000 -> {
            ((1/100)*200000 + (15/100)*150000 + (25/100)*(num-(200000+150000)))
        }
        else -> 100
    }
}

