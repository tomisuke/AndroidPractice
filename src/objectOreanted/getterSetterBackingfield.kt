package objectOreanted

import model.accessor

fun main() {
    /*アクセッサ(get:ゲッター,set:セッター)
        代入時、取得時に自動で呼ばれる
     */
    val p1 = accessor("プレイヤー1",100)
    p1.showStatus()
    //変数に名前を代入したとき、内部的にセッターが呼ばれる
    p1.name = ""
    p1.showStatus()
    println(p1.name)
    println(p1.nameLength)
}