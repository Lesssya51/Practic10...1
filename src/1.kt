fun generateNumbers(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    } else {
        val numbers = mutableListOf<Int>()
        for (i in n downTo 1) {
            numbers.add(i)
        }
        return numbers
    }
}

fun main() {
    val n = 5
    val numbers = generateNumbers(n)
    println("Числа от $n до 1: $numbers")
}