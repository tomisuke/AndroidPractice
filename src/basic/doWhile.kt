package basic

fun main() {
    //doを実行した後に条件を確かめることを繰り返す
    var i = 1
    do {
        println("i = $i")
        i++
    } while (i <= 10)
}