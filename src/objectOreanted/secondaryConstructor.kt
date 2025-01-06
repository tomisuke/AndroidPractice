package objectOreanted

import model.Character

//m
fun main() {
    //オブジェクト指向基礎

    //インスタンス化
    val p1= model.Character2("プレイヤー1",100)
    p1.showStatus()
    val p2= model.Character2("プレイヤー2")
    p2.showStatus()
    val p3 = model.Character2(500)
    p3.showStatus()
    val p4 = model.Character2()
    p4.showStatus()
}