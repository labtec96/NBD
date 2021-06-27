package exer_2

object task2 {
  def main(args: Array[String]) : Unit = {
    val konto1 = new KontoBankowe(10)
    println(konto1.stanKonta)

    konto1.wplata(20)
    println(konto1.stanKonta)

    konto1.wyplata(20)
    println(konto1.stanKonta)
    konto1.wyplata(5)
    println(konto1.stanKonta)

    val konto2 = new KontoBankowe()
    println(konto2.stanKonta)
  }

  class KontoBankowe(private var _stanKonta: Double) {
    def this() = this(0)

    def stanKonta : Double = _stanKonta

    def wplata(kwotaWplaty: Double) : Unit = {
      this._stanKonta = this._stanKonta + kwotaWplaty
    }

    def wyplata(kwotaWyplaty: Double) : Unit = {
      this._stanKonta = this._stanKonta - kwotaWyplaty
    }
  }
}