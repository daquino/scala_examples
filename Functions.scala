def greeting() =  { "Well met!" }

//you can invoke it with parentheses
println(greeting())

//or you can leave them out
println(greeting)

//optional return type
def threaten(): String = { "My magic will tear you apart!" }

//you can remove the curly braces for one-liners
def oops() = "That was a mistake."

//you can remove the parentheses too!
def sorry = "My apologies."

//but you have to call it without the parentheses
println(sorry)

//spoiler alert: functions can have parameters
def playAnimalCompanion(timesPlayed: Int) = {
  if(timesPlayed == 0) {
    "Huffer"
  }
  else {
    "Another Huffer"
  }
}

//me go face?
println(playAnimalCompanion(0))
println(playAnimalCompanion(1))

//functions can have multiple parameters too
def matchmaking(ranking: String, deck: String) = {
  (ranking, deck) match {
  case ("Rank 1", "Face Hunter") => ("Legendary", "Control Warrior")
  case ("Rank 2", "Grim Patron Warrior") => ("Legendary or Rank 1", "Handlock")
  case _ => ("Rank *", "Face Hunter")
  }
}

//the struggle is real
println(matchmaking("Rank 2", "Grim Patron Warrior"))
