# Functional Programming

### higher order functions
```scala
val calculate = (f: (Int, Int) => Int, x: Int, y: Int) => f(x, y)

val add = (x: Int, y: Int) => x + y
val subtract = (x: Int, y: Int) => x - y

println(calculate(add, 5, 6))
println(calculate(subtract, 10, 5))
```

### function returning a function
```scala
val add = (x: Int, y: Int) => x + y
val subtract = (x: Int, y: Int) => x - y
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
println(addition(5, 10))  // prints 15
println(subtraction(10, 5))  // prints 5
```

### curried function
```scala
val add = (x: Int, y: Int) => x + y
val incrementByTwo = add.curried(2)
println(incrementByTwo(5)) //prints 10
```

### curried method
```scala
def multiply(x: Int)(y: Int) = x * y
val triple = multiply(3) _
println(triple(10))
```
