def printItems(title: String, items: Traversable[String]) = {
  println
  println(s"=== ${title} ===")
  for(item <- items) {
    println(item)
  }
}

//Arrays can be defined by size and assign each element one by one
var lunchOptions = new Array[String](4)
lunchOptions(0) = "Chipotle"
lunchOptions(1) = "Five Points Pizza"
lunchOptions(2) = "Hattie B's"
lunchOptions(3) = "The Pharmacy Burger Parlor and Beer Garden"
printItems("Where do you want to eat?", lunchOptions)

//or you can define an array and it's values all at once
val chipotleSaladIngredients = Array("Lettuce", "Chicken", "Chicken", "Fajita Veggies", "Corn", "Cheese", "Guac")
printItems("What Daniel gets at Chipotle", chipotleSaladIngredients)

//you can create a List the traditional way
val chiptoleParkingSpots: List[Nothing] = List()
printItems("Worst parking lot ever", chiptoleParkingSpots)

//or you can create a List with values
val fivePointsBeers = List("Calfkiller", "Jackalope Bearwalker", "Einstok Pale Ale")
printItems("Five points is legit", fivePointsBeers)

//you can create an empty list with Nil
val hattieBsEmptyTables = Nil
printItems("Empty tables at Hattie B's", hattieBsEmptyTables)

//you can use the ::(cons) operator and Nil to define a list
val hattieBsHeatLevels = "Southern Heat" :: "Mild or Medium" :: "Hot" :: "Damn Hot" :: "Shut the cluck up" :: Nil
printItems("Hattie B's Heat Levels", hattieBsHeatLevels)

//you can get the head and tail of a list where the head is the first element
//of the list and tail is the rest
val pharmacySuggestions = "Pharmacy Burger" :: "Farm Burger" :: "Curry wurst" :: "Rootbeer Float" :: Nil
val firstItem = pharmacySuggestions.head
val everythingAfterwards = pharmacySuggestions.tail
println
println(s"First suggestion = ${firstItem}")
println(s"The rest = ${everythingAfterwards}")

//you can make a range with the to keyword
val chipotlePriceRange = 9 to 12
println(s"I usually spend ${chipotlePriceRange} dollars at Chipotle.")

//you can make a range with until to make the upper limit exclusive
val hattieBsPriceRange = 9 until 12
println(s"At Hattie B's i spend ${hattieBsPriceRange} dollars.")

//tuples can be created with values separate by commas surrounded by parentheses
val danielsFavoriteFivePointsPizza = ("Vodka Sauce", 25)

//or you can create a tuple using the relation operator ->
val pharmacySuggestion = "Pharmacy Burger" -> "Tator Tots"

//you can access elements in a tuple using it's index starting with 1
val pharmacySuggestedEntre = pharmacySuggestion._1  // Pharmacy Burger
val pharmacySuggestedSide = pharmacySuggestion._2   // Tator Tots
