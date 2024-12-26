package lectures.part1Basics

import scala.annotation.tailrec

object StackAndTailRecursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("computed factorial of " + n)

      result
    }

  //  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10,1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    ...
    = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    for x == 1 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
   */
  println(anotherFactorial(5))

  @tailrec
  def factHelper1(x: Int, accumulator: BigInt): BigInt =
    if (x <= 1) accumulator
    else factHelper1(x - 1, x * accumulator)

  println(factHelper1(20, 1))

  def concatenateString(aString: String, n: Int): String =
    @tailrec
    def wrapper(aString: String, n: Int, acc: String): String =
      if (n <= 0) acc
      else wrapper(aString, n - 1, aString + " " + acc)

    wrapper(aString, n, "")

  println(concatenateString("hi", 3))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(37))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))
}
