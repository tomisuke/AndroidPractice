package basic

fun main() {
    //PairをTripleに置き換えることで、3つの戻り値を扱うこともできる。
    //2つの値の名前を設定する方法
    val(sum,max) = sumMax(10,20,50,20,40)//代入する値を2つ設定
    println("sum=$sum,max=$max")
    //2つの値をペアで扱う方法
    val value:Pair<Int,Int> = sumMax(10,20,50,20,40)//代入する値を2つ設定
    println("value=$value")
    println("sum=${value.first}")
    println("sum=${value.second}")
}
fun sumMax(vararg numbers: Int):Pair<Int,Int> {//戻り値を2つ設定
    var sum = 0
    var max = 0
    for (number in numbers) {
        sum += number
        if (number > max) {
            max = number
        }
    }
    return Pair(sum,max)
}