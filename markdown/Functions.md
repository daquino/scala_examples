# Functions

### functions bodies take the form _(param1, param2, paramN) => { body }_
```scala
val greeting = () => { "Well met!" }
```

### you can invoke it with parentheses
```scala
println(greeting())
```

### leaving the parenthesis out returns the type
```scala
println(greeting)
```

### you can add an optional explicit return type in the form __functionName: paramType => returnType__
```scala
val threaten: () => String = () => { "My magic will tear you apart!" }
println(threaten())
```

### you can remove the curly braces for one-liners
```scala
val oops = () => "That was a mistake."
println(oops())
```

### function parameters take the form __name: Type__
```scala
val playAnimalCompanion = (timesPlayed: Int) => {
  if(timesPlayed == 0) {
    "Huffer"
  }
  else {
    "Another Huffer"
  }
}

println(playAnimalCompanion(0))  // Huffer
println(playAnimalCompanion(1))  // Another Huffer
```

### functions can have multiple parameters too
```scala
val matchmaking = (ranking: String, deck: String) => {
  (ranking, deck) match {
  case ("Rank 1", "Face Hunter") => ("Legendary", "Control Warrior")
  case ("Rank 2", "Grim Patron Warrior") => ("Legendary or Rank 1", "Handlock")
  case _ => ("Rank *", "Face Hunter")
  }
}

//the struggle is real
println(matchmaking("Rank 2", "Grim Patron Warrior"))  // (Legendary or Rank 1, Handlock)
```
