package basic

fun main() {
    var product = 1
    for (i in 1..5) {
        for (j in 1..5) {
            product *= i
        }
    }
    println("1から10までの積: $product")
}