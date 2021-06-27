package exer_2

object task4 {
  def main(args: Array[String]): Unit = {
    def minusOne(num: Int): Int = num + 2
    println(manipulateInt(4, minusOne))
  }

  def manipulateInt(number: Int, fun: Int => Int): Int = {
    fun(fun(fun(number)))
  }
}