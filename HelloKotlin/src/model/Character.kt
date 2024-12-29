//modelというパッケージに属すことを示す
package model

class Character {
    //プロパティ:クラスが持つ情報
    var name: String = "主人公"
    var hp: Int = 100
    fun showStatus() {
        println("name=$name hp=$hp")
    }
}