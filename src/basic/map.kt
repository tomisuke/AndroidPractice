package basic

fun main() {
    //キーと要素をセットで管理する
    //キーの重複は許可しない
    //可変長
    //宣言方法
    //genericsはキーと要素2つ指定する
    val map = mutableMapOf<String,String>(
        "orange" to "みかん",
        "apple" to "りんご",
        "melon" to "めろん"
    )//左がキー、右が要素
    println(map)
    //変更
    map["apple"] = "アポー"
    println(map)
    //追加
        //変更と同じ
    map["banana"] = "バナナ"
    println(map)
    //削除
    map.remove("apple")
    println(map)
}