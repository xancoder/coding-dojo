fun main() {
    val inputNumber = 27
    println(collatzIteration(inputNumber))
    collatzRecursive(inputNumber)
}

fun collatzIteration(number: Int): Int {
    var steps = 0
    var tmp = number
    while (tmp != 1) {
        print("$tmp ")
        tmp = if (tmp % 2 == 0) {
            tmp / 2
        } else {
            3 * tmp + 1
        }
        steps++
    }
    println(tmp)
    return steps
}

fun collatzRecursive(number: Int) {
    print("$number ")
    if (number == 1) {
        return
    }
    if (number % 2 == 0) {
        collatzRecursive(number / 2)
    } else {
        collatzRecursive(3 * number + 1)
    }
}
