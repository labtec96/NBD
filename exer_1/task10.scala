package exer_1

object task10 {
  def main(args: Array[String]) : Unit = {
    val integerList = List(123.0, 12312.0, 11.0, 12.0, -5.0, 2.0, -1.0, 2.0, -2.0, -23.0, -51.0, -231.4, 3.2, 1.1)

    println(getAbsoluteValues(integerList))
  }

  def getAbsoluteValues(list: List[Double]) : List[Double] = {

    list.filter(element => element >= -5 && element <= 12).map(filteredElement => filteredElement.abs)
  }
}
