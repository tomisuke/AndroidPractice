fun main() {
    val list: MutableList<Int> = mutableListOf(10,20,30)
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
}