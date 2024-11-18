fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    println(array[0])
    array[0] = 100
    println(array[0])
    //配列の要素を全て出力したい場合
    array.forEach { println(it) }//ラムダ式(今後説明)
    //型を指定する方法
        //型推論
        //データ型で指定
    val array1:Array<Int> = arrayOf(2,3,4,5)
        //arrayOfで指定
    val array2 = intArrayOf(1,2,3,4,5)
    //文字の保存
    val array3 = intArrayOf(1,2,3,4,5)

    //nullで要素を初期化する
    val array4 = arrayOfNulls<String>(5)
    //null許容型になる

    println("${array1[0]},${array2[0]},${array3[0]},${array4[0]}")

}