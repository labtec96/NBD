package exer_1

object task6 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    printTup(daysOfWeek, "Kot i Pies", 23)
  }
  def printTup(tup: (Any, String, Int)): Unit = {
    println(tup._1)
    println(tup._2)
    println(tup._3)
  }
}
