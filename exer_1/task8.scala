package exer_1

object task8 {
  def main(args: Array[String]) : Unit = {
    val integerList = List(123, 12312, 123, 0, 123, 0, 0, 0, 0, 23, 51, 231, 23, 1)

    println(removeZeros(integerList))
  }

  @scala.annotation.tailrec
  def removeZeros(list: List[Int], acc: List[Int] = List.empty): List[Int] = {
    list match {
      case Nil => acc
      case 0::tail => removeZeros(tail, acc)
      case head::tail => removeZeros(tail, acc:+head)
    }
  }
}
