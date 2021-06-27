package exer_1

object task1 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(stringWithLoop(daysOfWeek))
    println(stringWhereDayStartWithP(daysOfWeek))
    println(stringWhileLoop(daysOfWeek))
  }

  def stringWithLoop(list: List[String]) : String = {
    var str = ""

    for(elem <- list) {
      if(str == "")
        str = elem
      else
        str = str + ", " + elem

    }

    str
  }

  def stringWhereDayStartWithP(list: List[String]) : String = {
    var str = ""

    for(elem <- list.filter(_.toUpperCase().startsWith("P"))) {
      if(str == "")
        str = elem
      else
        str = str + ", " + elem
    }

    str
  }

  def stringWhileLoop(list: List[String]) : String = {
    var i = 0;
    var str = ""

    while (i < list.length) {
      if(str == "")
        str = list(i)
      else
        str = str + ", " + list(i)
      i = i+1
    }

    str
  }
}
