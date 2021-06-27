package exer_2

object task5 {
  def main(args: Array[String]): Unit = {

    //Pracownik
    var pracownik = new Osoba("Damian", "Kopyto") with Pracownik
    pracownik.pensja = 1000
    println("Pensja pracownika: " + pracownik.pensja)
    println("Podatek pracownika: " + pracownik.podatek)
    //Nauczyciel
    var nauczyciel = new Osoba("Kamil", "Nauczycielowski") with Nauczyciel
    nauczyciel.pensja = 1000
    println("Pensja nauczyciela: " + nauczyciel.pensja)
    println("Podatek nauczyciela: " + nauczyciel.podatek)
    //Student
    var student = new Osoba("Tom", "Piwko") with Student
    println("Podatek nauczyciela: " + student.podatek)

    //Student-> pracownik
    var studentPracownik = new Osoba("Tomasz", "Piona") with Student with Pracownik
    studentPracownik.pensja = 10000
    println("Pensja studentPracownik: " + studentPracownik.pensja)
    println("Podatek studentPracownik: " + studentPracownik.podatek)

    //Pracownik->student
    var pracownikStudent = new Osoba("Tomasz", "Piona") with Pracownik with Student
    pracownikStudent.pensja = 10000
    println("Pensja pracownikStudent: " + pracownikStudent.pensja)
    println("Podatek pracownikStudent: " + pracownikStudent.podatek)

    //Podatek został nadpisany przez przez klasę która rozszerzała jako druga
  }

  abstract class Osoba(val imie: String, val nazwisko: String) {
    def podatek: BigDecimal
  }

  trait Pracownik extends Osoba {
    var pensja: BigDecimal = 0
    override def podatek: BigDecimal = this.pensja * 0.2
  }

  trait Nauczyciel extends Pracownik {
    override def podatek: BigDecimal = this.pensja * 0.1
  }

  trait Student extends Osoba {
    override def podatek: BigDecimal = 0
  }
}