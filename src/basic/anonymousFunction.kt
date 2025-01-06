package basic

fun main() {
    //ラムダ式
    println(calcC(5, 10) { x: Int, y: Int -> x + y })
    //無名関数
    val num = calcB(5, 10, fun(x: Int, y: Int): Int = x + y)
    //無名関数は戻り値のデータ型を指定できる
}

fun calcC(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)//func(calcAが渡されている)にa,bを渡す