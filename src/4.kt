fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i.toString())
        }
    }

    return result
}

fun main() {
    val n = 15
    val fizzBuzzList = fizzBuzz(n)
    println(fizzBuzzList)
}