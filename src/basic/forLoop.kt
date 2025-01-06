package basic

fun main() {
    //リストとForを組み合わせる
    val array = arrayOf("りんご", "みかん", "ぶどう")
    for (i in array) {
        println(i)
    }
    val list = listOf("Tokyo", "Osaka", "Kyoto")
    for (place in list) {
        println(place)
    }
    //withIndex
    //要素の番号を抽出することがデキる
    for ((index, place) in list.withIndex()) {
        println("$index = $place")
    }
    //indexのみ出力する方法
    for (index in list.indices) {
        println("index = $index")
    }
    //mapを使う
    val map = mapOf<Int, String>(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for(data in map){
        println(data)
    }
    //keyとvalueを分ける
    for((key, value) in map){
        println("$key は $value")
    }
}