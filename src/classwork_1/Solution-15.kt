package classwork_1

fun main(){
    var myArr = arrayOf(1,2,4,6,7,8,9,34,56,77)
    displayodd(myArr)
}

fun displayodd(myArr: Array<Int>) {
    println("The odd numbers in the array are :")
    for (i:Int in myArr.indices)
    {
        if (myArr[i] % 2 == 1){
            println(myArr[i])
        }
    }
}
