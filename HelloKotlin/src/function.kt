fun main() {
    sayMessage()
    sayMessage2("buy")
    val back = sayMessage3("good")
    println(back)
    val back2 = sayMessage4("こんにちは","関数")
    println(back2)
}

//引数なし戻り値なし
fun sayMessage(){
    println("hello function")
}
//引数あり戻り値なし
fun sayMessage2(test: String){
    println("$test function")
}
//引数あり戻り値あり
fun sayMessage3(test: String):String{
    return "$test function"
}
//{}省略、1行で書く場合、=で結べる
fun sayMessage4(str1: String, str2: String):String = str1 + str2