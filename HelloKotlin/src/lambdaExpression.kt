fun main() {
    // 高階関数:引数や戻り値に関数を指定する
    // ラムダ式:使い捨ての関数
    val func = ::calcA // ::をつけることで、funcに関数の参照先を設定できる。
    // funcは高階関数になる。
    println(func(10, 5))
    val n1 = calcB(5, 10, /*funcに5,10を渡す*/ ::calcA /*funcにcalcAを渡す*/)
    println(n1)
    // ラムダ式
    val n2 = calcB(5, 10) { x: Int, y: Int -> x + y } // {}内をfunc渡す

    println(n2)
    // it
    val num = funcB(10, ::funcA) // 高階関数、10をfuncAに渡す
    println(num)
    val num2 = funcB(10) { x: Int -> x + 1 } // 10を{}内のxに渡す

    println(num2)
    // ラムダ式の引数が1つしかない場合、itに置き換えられる。(10をitに渡す)
    val num3 = funcB(10) { it + 1 }
    println(num3)
}

fun calcA(a: Int, b: Int) = a + b

fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) =
        func(a, b) // funcにa,bを渡す。funcには、(Int, Int) -> Int型の任意の関数を指定できる。

// func: (Int, Int)          -> Int
//      (関数が受け取るデータ型)->(関数が返却するデータ型)
// funcは、Int型の引数を2つ受け取り、intを返す関数
fun funcA(a: Int) = a + 1

fun funcB(a: Int, func: (Int) -> Int) = func(a)
