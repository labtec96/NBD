package exer_1

object task7 {
  def main(args: Array[String]): Unit = {

    println(getByKey("audiAudiTEST").getOrElse(0))
    println(getByKey("audi").getOrElse(0))
  }

  def getByKey(key: String): Option[Double] = {
    val productsWithPrice = Map("audi" -> 100000.00, "bmw" -> 500000.00, "fiat" -> 20000.00, "mercedes" -> 10000000.00)
    productsWithPrice.get(key)
  }

}
