fun generatePyramid(n: Int) {
    for (i in 1..n) {
        repeat(n - i) { print(" ") }
        repeat(2 * i - 1) { print("#") }
        repeat(n - i) { print(" ") }
        println()
    }
}

fun main() {
    val n = 5
    generatePyramid(n)
}