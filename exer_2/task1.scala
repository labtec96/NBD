package exer_2

object task1 {
  val workingDays: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek")
  val freeDays: List[String] =  List("Sobota", "Niedziela")
  def main(args: Array[String]) : Unit = {

    println(checkDay("test"))
    println(checkDay("Poniedziałek"))
    println(checkDay("Wtorek"))
    println(checkDay("Środa"))
    println(checkDay("Czwartek"))
    println(checkDay("Piątek"))
    println(checkDay("Sobota"))
    println(checkDay("Niedziela"))
  }

  def checkDay(day: String): String = day match {
    case x: String if workingDays.contains(x) => "Praca"
    case x: String if freeDays.contains(x) => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
