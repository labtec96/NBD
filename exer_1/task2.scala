package exer_1

object task2 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(recursivelyCommaSeparated(daysOfWeek))
    println(recursivelyReversedCommaSeparated(daysOfWeek))
  }

  def recursivelyCommaSeparated(list: List[String]) : String = {
    if (list.tail.nonEmpty)
      list.head + ", " + recursivelyCommaSeparated(list.tail)
    else
      list.head
  }

  def recursivelyReversedCommaSeparated(list: List[String]) : String = {
    if (list.tail.nonEmpty)
      recursivelyReversedCommaSeparated(list.tail) + ", " + list.head
    else
      list.head
  }
}
