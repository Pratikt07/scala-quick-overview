package lectures.part1Basics

import scala.annotation.tailrec

object functions extends App {

  // def : keyword to define a function
  def aFunction(a: String, b: Int): String = a + " " + b

  //you can write like this as well
  def aSecondFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 7))

  // calling a function is also an expression

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // You need to explicitly specify return type for a recursive function

  // when you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // Auxiliary functions

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // Exercises
  /*
    1. A greeting unction (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1 * 2 * 3 * .... * n
    3.  Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime.
   */

  def greetWithInfo(name: String, age: Int) : String = s"Hi, my name is $name and I am $age years old."

  def factorial(n: Int): Int =
    if(n <= 0) 1
    else n * factorial(n-1)


  def getFibonacci(n: Int): Int =
    if(n <= 2) 1
    else getFibonacci(n - 1) + getFibonacci(n - 2)



  def isPrime(num: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
    if(t <= 1) true
    else num % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(num / 2)
  }


  println(greetWithInfo("Danny", 26))
  println(factorial(5))
  println(getFibonacci(5))

  println(isPrime(37 * 17))
  println(isPrime(37))
  println(isPrime(2003))

}
