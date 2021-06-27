package exer_1

import scala.annotation.tailrec

object task3 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(tailrecRecursivelyCommaSeparated(daysOfWeek))
  }

  def tailrecRecursivelyCommaSeparated(list: List[String]) : String = {
    @tailrec
    def tailrecHelper(list: List[String], result: String) : String = {
      if(list == Nil)
        result
      else
        tailrecHelper(list.tail, result + ", " + list.head)
    }

    tailrecHelper(list.tail, list.head)
  }
}
