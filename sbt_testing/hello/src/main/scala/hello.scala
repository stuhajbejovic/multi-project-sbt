import testing.test123

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println(s"This is from common: ${test123.msg}")
  }
}
