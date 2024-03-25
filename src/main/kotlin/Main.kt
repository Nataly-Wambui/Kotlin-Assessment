import javax.print.attribute.standard.QueuedJobCount

fun main() {
    tongueTwister("Barnie bakes brown bagels and buns")
    println(calculate(arrayOf(21,23,25,46,90)))
    volumeOfSphere(4)
    println(isPalindrome("kayak"))
}
fun tongueTwister(sentence:String){
    var newString= sentence.split(",")
    println(newString)

}

data class Calculation(
    var sum: Int,
    var average: Int,
    var count: Int,
)
fun calculate(nums:Array<Int> ): Calculation{
    val sum = nums.sum()
    val count = nums.count()
    val average = sum/count

    val calculator = Calculation(sum, count,average)
    return calculator
}

fun volumeOfSphere(r:Int){
    println((4/3) * (3.14159)* (r*r*r))
}

fun isPalindrome(word:String):Boolean{
    if (word.reversed()== word)
        return true
    else
        return false
}




