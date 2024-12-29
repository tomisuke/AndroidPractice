fun main() {
    println( union(1, 2, 3, 4))

    val intArray = intArrayOf(1, 2, 3, 4, 5)

    //スプレッド演算子
    //*をつけることで可変長引数にできる
    println(union(*intArray))
}

//可変長引数
fun union(vararg array: Int): String {//引数の数をいくつにしても良い
    var str = ""
    for (i in array) {
        str += i
    }
    return str
}