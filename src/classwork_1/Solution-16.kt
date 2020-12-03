package classwork_1

fun main(){
    var myArr = arrayOf(1,2,4,6,7,8,9,34,56,77)
    sumofevennos(myArr)
}

fun sumofevennos(myArr: Array<Int>) {
    var sum=0
    for (i:Int in myArr.indices)
    {
        if (myArr[i] % 2 == 0){
            sum += myArr[i]
        }
    }
    println("The sum of even numbers in the array is $sum")
}
