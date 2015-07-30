//functions take the form (param1, param2, paramN) => { body }
val greeting = () => { "Well met!" }

//you can invoke it with parentheses
println(greeting())

//leaving the parenthesis out returns the type
println(greeting)

//you can add an optional explicit return type in the form
//: paramType => returnType
val threaten: () => String = () => { "My magic will tear you apart!" }
println(threaten())

//you can remove the curly braces for one-liners
val oops = () => "That was a mistake."

println(oops())

//spoiler alert: functions can have parameters
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

//functions can have multiple parameters too
val matchmaking = (ranking: String, deck: String) => {
  (ranking, deck) match {
  case ("Rank 1", "Face Hunter") => ("Legendary", "Control Warrior")
  case ("Rank 2", "Grim Patron Warrior") => ("Legendary or Rank 1", "Handlock")
  case _ => ("Rank *", "Face Hunter")
  }
}

//the struggle is real
println(matchmaking("Rank 2", "Grim Patron Warrior"))  // (Legendary or Rank 1, Handlock)
