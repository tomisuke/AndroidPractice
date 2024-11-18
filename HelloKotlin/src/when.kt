fun main() {
    val num = 23;

    when (num) {
        5 -> println("num = 5")
        6, 7 -> println("num = 6,7")
        in 11..20 -> println("num = 11,20")
        //複数の場合{}で囲う
        else -> {
            println("その他")
            println("あてはまりません")
        }
    }
    //代入
    var str: String = when (num) {
        5 -> "num = 5"
        6, 7 -> "num = 6,7"
        in 11..20 -> "num = 11,20"
        //複数の場合{}で囲う
        else -> "あてはまりません"
    }
    println(str)
    //型の判別
    val num2: Any = 20.0
    //Any型なので、型を判別することができる
    when (num2) {
        is Int -> println("int")
        is Double -> println("double")
    }
}