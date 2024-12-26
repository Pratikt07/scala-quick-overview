package lectures.part1Basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  // To access the string characters using index
  println(str.charAt(2))
  // output: l

  // access substring inside the string
  println(str.substring(7, 11))
  // output: I am

  // we can split the string using separator
  println(str.split(" ").toList)
  // output: List(Hello,, I, am, learning, Scala)

  // we can replace set of characters with other
  println(str.replace(" ", "-"))
  // output: Hello,-I-am-learning-Scala

  // lowercase a string
  println(str.toLowerCase)
  // output: hello, i am learning scala

  // get length of string
  println(str.length)
  // output: 26

  // Scala specific utility functions
  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  // prepending a char 'a' to aNumberString
  println('a' +: aNumberString)
  // output: a45

  // appending char 'a' to aNumberString
  println(aNumberString :+ 'a')
  // output: 45a

  // to reverse a string
  println(str.reverse)
  // output: alacS gninrael ma I ,olleH

  // list like function
  println(str.take(2))
  // output: He

  // Scala-specific: String interpolators

  // 1. s-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)


}
