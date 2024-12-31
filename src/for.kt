fun main() {
    //カウントアップ
    for(i in 0 .. 10){
        println(i)
    }
    for(i in 0 until 10){
        println(i)
    }
    //カウントダウン
    for(i in 10 downTo 0){
        println(i)
    }
    //変化量の変更
    for(i in 10 downTo 0 step 2){
        println(i)
    }
    //2重ループ
    for(i in 0 ..10 step 2){
        for(j in 10 downTo 0 step 2){
            println(i*j)
        }
    }
}