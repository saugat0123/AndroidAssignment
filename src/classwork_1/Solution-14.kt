package classwork_1

fun main(){
    var myArr = arrayOf(1,2,4,6,7,8,9,34,56,77)
    evennos(myArr)
}

fun evennos(myArr: Array<Int>) {
    println("The even numbers in the array are :")
    for (i:Int in myArr.indices)
    {
        if (myArr[i] % 2 == 0){
            println(myArr[i])
        }
    }
}
