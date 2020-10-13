import java.util.*

fun main() {
    val stringAsACharSequence = "12345678900000000000-Hello-World"
    countChar(stringAsACharSequence)
}

fun countChar(tmpString: String) {
    // use TreeMap which is naturally sorted
    val counts = TreeMap<Char, Int>()

    tmpString.forEach { letter ->
        counts[letter] = counts.getOrPut(letter, { 0 }) + 1
    }

    for ((letter, value) in counts) {
        val tmp = value.toDouble() / tmpString.count()
        println("'%c' %d %.2f".format(letter, value, tmp))
    }
}
