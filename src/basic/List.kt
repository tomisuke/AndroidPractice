package basic

//一般的に配列よりリストを使うらしい。
fun main() {
    val list1: List<Int> = listOf(1,2,3,4,5)//変更不可能
    val list: MutableList<Int> = mutableListOf(10,20,30)//変更可能
    println(list[0])

    list[0] = 100
    println(list)
    //追加
    list.add(200)
    println(list)
    //場所指定して追加
    list.add(0,500)
    println(list)
    //場所指定して削除
    list.removeAt(0)
    println(list)
    //要素指定して削除
    list.remove(100)
    println(list)
}