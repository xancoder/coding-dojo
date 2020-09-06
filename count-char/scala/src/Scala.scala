import scala.collection.mutable

object Scala {

  def main(args: Array[String]): Unit = {
    val inputString: String = "12345678900000000000-Hello-World"
    countChar(inputString)
  }

  def countChar(tmpString: String): Unit = {
    // use TreeMap which is naturally sorted
    val counts: mutable.TreeMap[Char, Int] = mutable.TreeMap()

    for (letter <- tmpString) {
      if (counts.contains(letter)) {
        counts.put(letter, counts(letter) + 1)
      } else {
        counts.put(letter, 1)
      }
    }

    counts.keys.foreach { i =>
      val percent = counts(i).toFloat / tmpString.length
      printf("'%c' %d %.2f\n", i, counts(i), percent)
    }
  }

}
