package exer_1

object task4 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(commaSeparatedFoldl(daysOfWeek))
    println(commaSeparatedFoldr(daysOfWeek))
    println(commaSeparatedFoldlStartWithP(daysOfWeek))
  }

  def commaSeparatedFoldl(list: List[String]): String = {
    list.foldLeft("") {
      (acc, day) =>
        acc + (if (day == list.head) day else ", " + day)
    }
  }

  def commaSeparatedFoldr(list: List[String]): String = {
    list.foldRight("") {
      (acc, day) =>
        acc + (if (day == list.last) day else ", " + day)
    }
  }

  def commaSeparatedFoldlStartWithP(list: List[String]): String = {
    list.foldLeft("") {
      (acc, day) =>
        if (day.startsWith("P"))
          acc + (if (day == list.head) day else ", " + day)
        else
          acc
    }
  }
}
