package classwork_1

fun main(){
    val dictionaryApp = mapOf<String,String>(
            "dog" to "first animal",
            "cat" to "second animal",
            "horse" to "third animal"
    )

    println("Enter a word:")
    val word = readLine()!!
    println("meaning of $word is: ${dictionaryApp[word]}")
}