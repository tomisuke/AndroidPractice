//modelというパッケージに属すことを示す
package model

class Character(name: String, hp: Int = 10/*引数が渡されなかった場合使用される規定値を設定できる*/) {
    //プロパティ:クラスが持つ情報
    var name: String
    var hp: Int

    init {//initで初期値の代入を行う
        this.name = name
        this.hp = hp
    }

    fun showStatus() {
        println("name=$name hp=$hp")
    }
}

//プロパティ宣言
//変数にプライマリコンストラクタにvarをつける事で、初期値の代入を省略できる
class Character2(var name: String, var hp: Int) {
    //プロパティ:クラスが持つ情報
    fun showStatus() {//プライマリコンストラクタに一致する場合実行
        println("name=$name hp=$hp")
    }
    //セカンダリコンストラクタ
    //引数が不足している場合に実行される
    //複数定義できる
    //thisで、プライマリコンストラクタに値を返す
    constructor(name: String/*コンストラクタからnameを受け取る*/) : this(name, hp = 50) {//nameのみ渡された場合実行
        println("**以下、セカンダリ**")
    }
    constructor(hp: Int/*コンストラクタからhpを受け取る*/) : this("プレイヤー3", hp)//hpのみ渡された場合実行
    constructor(): this("プレイヤー4",10)//コンストラクタに値が代入されなかった場合実行
}