def printItems(title: String, items: Traversable[String]) = {
  println
  println(s"=== ${title} ===")
  for(item <- items) {
    println(item)
  }
}

//Vectors can be used as an immutable indexed sequence
val lunchOptions = Vector("Chipotle", "Five Points Pizza", "Hattie B's", "The Pharmacy Burger Parlor and Beer Garden")

//use +: to prepend to the Vector
val prependedLunchOptions = "Peg Leg Porker" +: lunchOptions

//use :+ to append an item to the Vector
val appendedLunchOptions = prependedLunchOptions :+ "Bakersfield"

//use the updated method to create a new vector with the item at the specified index updated
val updatedLunchOptions = appendedLunchOptions.updated(0, "Samurai Sushi")

//access elements of the Vector using ()
val fridayLunch = appendedLunchOptions(2)

printItems("Lunch", updatedLunchOptions)

//you can create a List the traditional way
val chiptoleParkingSpots = Nil
printItems("Worst parking lot ever", chiptoleParkingSpots)

//or you can create a List with values
val fivePointsBeers = List("Calfkiller", "Jackalope Bearwalker", "Einstok Pale Ale")

//you can access the head and tail of a List
val firstBeer = fivePointsBeers.head
val everythingAfterwards = fivePointsBeers.tail
printItems("Five points is legit", fivePointsBeers)

//map example
val fivePointsPieMenu = Map("Vodka Sauce" -> 25, "Hot Hawaiian" -> 23)
val vodkaSaucePrice = fivePointsPieMenu("Vodka Sauce")
val fivePointsUpdatedPieMenu = fivePointsPieMenu + ("T-Rex" -> 25)
val danielsFavoritePizzas = fivePointsUpdatedPieMenu - "Hot Hawaiian"

//tuples can be created with values separate by commas surrounded by parentheses
val danielsFavoriteFivePointsPizza = ("Vodka Sauce", 25)

//or you can create a tuple using the relation operator ->
val pharmacySuggestion = "Pharmacy Burger" -> "Tator Tots"

//you can access elements in a tuple using it's index starting with 1
val pharmacySuggestedEntre = pharmacySuggestion._1  // Pharmacy Burger
val pharmacySuggestedSide = pharmacySuggestion._2   // Tator Tots
