package basic

fun main() {
    //break
    for (i in 0..10) {
        if (i == 7) {
            break
            //途中でforを抜ける
        }
        println(i)
    }
    //continue
    for (i in 0..10) {
        if (i % 2 == 0) {
            continue
            //このループは途中で抜けて、次のループに行く
        }
        println(i)
    }
    //2重forの場合、
    // 内側のforをbreakで抜けても外側のforは抜けない
    for (i in 0..10) {
        for (j in 0..10) {
            if (j == 7) {
                break
            }
            print(j)
        }
        println()
    }
    //ラベル
    //内側から2重forを抜けることができる
    outer@for (i in 0..10) {
        for (j in 0..10) {
            if (j == 6) {
                break@outer
            }
            print(j)
        }
    }
}