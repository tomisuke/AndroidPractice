package basic

fun main() {
    //基本Listと同じ
    //順番の概念がなく、要素の重複を許可しない。
    val set:MutableSet<Int> = mutableSetOf(1,2,3,4,5)
    println(set)
    set.add(40)
    set.add(40)
    //2回addしてもエラーは出ないが、同じ値は1つだけ
    println(set)
    //削除
    set.remove(3)
}