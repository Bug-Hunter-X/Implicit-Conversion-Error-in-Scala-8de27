```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object Main {
  implicit def stringToInt(s: String): Int = s.toInt
  //Note:  Above line should be used cautiously. Error handling for non-numeric strings should be added in production code.

  def main(args: Array[String]): Unit = {
    val myInstance = new MyClass[String]("123") // Note: only works with strings representing integers
    println(myInstance.myMethod)
  }
}
```