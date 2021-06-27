package exer_1

object task9 {
  def main(args: Array[String]): Unit = {
    val integerList = List(123, 12312, 123, 0, 123, 0, 0, 0, 0, 23, 51, 231, 23, 1)

    println(incrementElements(integerList));
  }

  def incrementElements(integerList: List[Int]): List[Int] = {
    integerList map { case (element) => (element + 1) }
  }
}
