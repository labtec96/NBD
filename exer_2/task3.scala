package exer_2

object task3 {
  def main(args: Array[String]): Unit = {

    println(przywitaj(new Osoba("Kamil", "Bąk")))
    println(przywitaj(new Osoba("Damian", "Bzik")))
    println(przywitaj(new Osoba("Daria", "Kowalska")))
    println(przywitaj(new Osoba("Jan", "Jankowski")))
  }

  case class Osoba(val imie: String, val nazwisko: String) {}

  def przywitaj(osoba: Osoba) = osoba match {
    case Osoba(_, "Bąk") => "Witaj Bąku"
    case Osoba("Damian", _) => "Siema Damian"
    case Osoba("Jan", "Jankowski") => "Joł Janku Jankowski"
    case Osoba(imie, _) => s"Hej $imie"
  }
}