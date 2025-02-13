```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInstance = new MyClass[String]("hello")
    // This will cause a type mismatch error because there is no implicit conversion from String to Int
    println(myInstance.myMethod)
  }
}
```