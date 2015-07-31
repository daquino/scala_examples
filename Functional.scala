//higher order functions
val map = (list: List[Int], f: Int => Int) => {
  for(item <- list) yield f(item)
}

val double = (x: Int) => x * 2
val square = (x: Int) => x * x

val list = List(1, 2, 3)

val doubleList = map(list, double)
val squaredList = map(list, square)

println(s"Double list = ${doubleList}")
println(s"Squared list = ${squaredList}")

//function returning a function
val selectOperation: (String) => ((Int, Int) => Int) = (operator: String) => {
  val add = (x: Int, y: Int) => x + y
  val subtract = (x: Int, y: Int) => x - y
  if(operator == "+") {
    add
  }
  else {
    subtract
  }
}

val addition = selectOperation("+")
val subtraction = selectOperation("-")
println(addition(5, 10))
println(subtraction(10, 5))

//curried function
val add = (x: Int, y: Int) => x + y
val incrementByTwo = add.curried(2)
println(incrementByTwo(5))

//curried method
def multiply(x: Int)(y: Int) = x * y
val triple = multiply(3) _
println(triple(10))
