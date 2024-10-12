fun main() {
    println("Введите текст для шифрования:")
    val text = readLine()!!

    println("Введите сдвиг (целое число):")
    val shift = readLine()!!.toInt()

    val encryptedText = caesarCipher(text, shift)

    println("Зашифрованный текст:")
    println(encryptedText)
}

fun caesarCipher(text: String, shift: Int): String {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val alphabetLength = alphabet.length

    return text.uppercase().map { char ->
        if (char.isLetter()) {
            val index = alphabet.indexOf(char)
            val shiftedIndex = (index + shift) % alphabetLength
            alphabet[shiftedIndex]
        } else {
            char
        }
    }.joinToString("")
}