//higher order functions
val calculate = (f: (Int, Int) => Int, x: Int, y: Int) => f(x, y)

val add = (x: Int, y: Int) => x + y
val subtract = (x: Int, y: Int) => x - y

println(calculate(add, 5, 6))
println(calculate(subtract, 10, 5))

//function returning a function
val selectOperation: (String) => ((Int, Int) => Int) = (operator: String) => {
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
val incrementByTwo = add.curried(2)
println(incrementByTwo(5))

//curried method
def multiply(x: Int)(y: Int) = x * y
val triple = multiply(3) _
println(triple(10))
