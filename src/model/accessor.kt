package model

class accessor {
    var name: String = "a"
        set(value) {//値を代入したときに呼ばれる関数
            field = if (value == "") {
                println("名前が入力されていない")
                //set内では、fieldが変数名として扱われる
                "NO NAME"
                //fieldを使う理由:setは変数に代入されたときに実行されるから、直接代入すると無限ループになるから
            } else {//値を参照した時に呼ばれる関数
                value
            }
        }
        get(){
            return field + "さん"
        }
    var hp: Int
    //get()の活用例
    val nameLength :Int
        get() = name.length

    constructor(name: String, hp: Int) {
        this.name = name
        this.hp = hp
    }

    fun showStatus() {
        println("名前:$name")
        println("hp:$hp")
    }
}