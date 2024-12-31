fun main() {
    //デフォルト引数:引数が渡されなかった場合に使用する値
    val num = calc()
    println(num)
    //名前付き引数:代入する引数を明示する
    val num2 = calc(height = 10)
    println(num2)
}

fun calc(width: Int=5, height: Int = 5/*デフォルト引数*/): Int = width * height