package lectures.part1Basics

/*

The "extends App" is equivalent to creating a main function,l
which makes this application runnable.

An alternative way to skip "extends App" and in the body of this object
inside { }, type "main", then hit cltr-space to generate the function
that will be called when running the app.
(in IntellijIdea)
 */

object ValuesVariablesTypes extends App {

  val x: Int  = 42
  println(42)

  // vals are immutable
  // compiler can infer types

  val aString = "hello"; val anotherString = "hello 2" // not recommended to write like this instead write each on separate line

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 242424242444L
  val aFloat: Float = 3.14555f
  val aDouble: Double = 3.14242423

  // variables
  var aaVariable: Int = 4
  aaVariable = 5 // side effects

  /*

  example of side effects is changing a variable
   */

  /*
    Takeaways :

  1. vals:
      syntax: val name: type(can be inferred) = {value}
      Immutable = can't be reassigned
  2. var:
      syntax: var name: type(can be inferred) = {value}
              name = {new_value}
  * Prefer vals over vars
  * all vals and vars have types
  * compiler automatically infers types when omitted (not provided)
  * learned how to use basic types
    a. Boolean
    b. Int, Long, Double
    c. String
   */



}
