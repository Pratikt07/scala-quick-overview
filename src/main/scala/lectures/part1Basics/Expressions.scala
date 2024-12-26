package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // Math operators = + - * / & | * << >> >>> (right shift with zero extension)

  println(1 == x)
  // comparative operator : == != > >= < <=

  println(!(1 == x))
  // Boolean operator : ! && ||

  // all of the above are side effects which works with Variables only

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression

  val aCondition = true

  val aConditionedValue = if (aCondition) 5 else 3
  /*
  In java or another language you need to write like this
  Int aConditionedValue;
  if (aCondition)
    aConditionedValue = 5
  else
    aConditionedValue = 3;
   */

  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)


  /*
  There are loops in scala but we discourage using them because they are reminiscent of imperative programming like Java.
  They don't really return anything meaningful and only execute side effects
  Example :
   */
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  /*
  This is a while loop in scala.
  Please avoid while loop because while and looping in general
  specific to imperative programming that in Java or Python or C,
  he single worst thing a Scala programmer can do really is write imperative code with
  scala syntax So Please don't do this.
   */

  // Scala forces everything to be an expression

  // EVERYTHING in scala is an Expression!

  // Only definitions like the definition of a val or a class or a package are not expressions but rest everything is an Expression.

  val aWeirdValue = (aVariable = 3)

  /*
  Unit iss a very special type in Scala, which is equivalent to void in other languages and
  Its just mean  don't return anything meaningful and the only possible value of unit is
  let's print
   */
  println(aWeirdValue)

  // unit type can hold only "()" value
  /*
  As we discussed reassigning a variable is a side effect and
  Side effects in scala are actually expressions returning unit

  while loops are expressions which returns side effects (i.e. units)
   */

  val aWhileLoopValue = while (i < 10) {
    println(i)
    i += 1
  }

  println(aWhileLoopValue)

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }
  /*
  Code block is an Expression
  1. the value of a block is the value of the last expression
  2. code blocks can have their own definition of values and variables inside the code block and can be accessible inside the block only
   */

  // Takeaways
  /*
  1. Basic expressions: operators
    val x = 3 + 5
    val xIsEven = x % 2 == 0
    val xIsOdd = !xIsEven
  2. if in Scala is an expression
    val cond: Boolean = ...
    val i = if (cond) 42 else 0
  3. Code blocks in Scala are expressions
    a. the value of the block is the value of its last expression
    val x = {
      val cond = Boolean = ...
      if (cond) 42 else 0
    }
  5. Expression vs Instructions
    a. instructions are executed(think Java), expressions are evaluated(Scala)
    b. Instructions means 'do something' and expressions means 'give me the value of something'
    c. In scala we'll think in terms of expressions
   */

  // Exercises :

  //1. what is difference between "hello world" vs println("hello world")
  //2. what is value of below code
  val someValue = {
    2 < 3
  }
  println(someValue)

  //3. what is value of this
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)

  print(println("hello world"))
  println("hello world")

}
