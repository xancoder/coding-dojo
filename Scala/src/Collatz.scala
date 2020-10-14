import scala.annotation.tailrec

object Collatz {

  def main(args: Array[String]): Unit = {
    val inputNumber: Int = 27
    println(collatzIteration(inputNumber))
    collatzRecursive(inputNumber)
  }

  def collatzIteration(number: Int): Int = {
    var steps: Int = 0
    var tmp: Int = number
    while (tmp != 1) {
      print(tmp + " ")
      if (tmp % 2 == 0) {
        tmp /= 2
      } else {
        tmp = 3 * tmp + 1
      }
      steps = steps + 1
    }
    println(tmp)
    steps
  }

  @tailrec
  def collatzRecursive(number: Int): Unit = {
    print(number + " ")
    if (number == 1) {
      return
    }
    if (number % 2 == 0) {
      collatzRecursive(number / 2)
    } else {
      collatzRecursive(3 * number + 1)
    }
  }

}
