//def starts the function definition
//= separates the signature from the body
def greeting() =  { "Well met!" }

//you can invoke it with parentheses
greeting()

//or you can leave them out
greeting

//you can add an optional return type in the form
//: RETURN_TYPE
def threaten(): String = { "My magic will tear you apart!" }

//you can remove the curly braces for one-liners
def oops() = "That was a mistake."

//you can remove the parentheses too!
def sorry = "My apologies."

//but you have to call it without the parentheses
sorry

//spoiler alert: functions can have parameters
def playAnimalCompanion(timesPlayed: Int) = {
  if(timesPlayed == 0) {
    "Huffer"
  }
  else {
    "Another Huffer"
  }
}

playAnimalCompanion(0)  // Huffer
playAnimalCompanion(1)  // Another Huffer

//functions can have multiple parameters too
def matchmaking(ranking: String, deck: String) = {
  (ranking, deck) match {
  case ("Rank 1", "Face Hunter") => ("Legendary", "Control Warrior")
  case ("Rank 2", "Grim Patron Warrior") => ("Legendary or Rank 1", "Handlock")
  case _ => ("Rank *", "Face Hunter")
  }
}

//the struggle is real
println(matchmaking("Rank 2", "Grim Patron Warrior"))  // (Legendary or Rank 1, Handlock)
