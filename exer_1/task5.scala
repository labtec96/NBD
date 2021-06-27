package exer_1

object task5 {
  def main(args: Array[String]): Unit = {
    val productsWithPrice = Map("audi" -> 100000.00, "bmw" -> 500000.00, "fiat" -> 20000.00, "mercedes" -> 10000000.00)

    val discountProducts = addDiscountToProducts(productsWithPrice);

    println(discountProducts)
  }

  def addDiscountToProducts(productsWithPrice: Map[String, Double]): Map[String, Double] = {
    productsWithPrice map { case (key, value) => (key, 0.9 * value) }
  }
}
