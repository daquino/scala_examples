# Data Structures

### Vectors can be used as immutabled indexed sequences
```scala
val lunchOptions = Vector("Chipotle", "Five Points Pizza", "Hattie B's", "The Pharmacy Burger Parlor and Beer Garden")

//use +: to prepend to the Vector
val updatedLunchOptions = "Peg Leg Porker" +: lunchOptions

//use :+ to append an item to the Vector
val finalLunchOptions = updatedLunchOptions :+ "Bakersfield"

//access elements of the Vector using ()
val fridayLunch = finalLunchOptions(2)
```

### The easiest way to create a list is by using the List() factory method
```scala
val fivePointsBeers = List("Calfkiller", "Jackalope Bearwalker", "Einstok Pale Ale")
```

### Nil can represent the empty list
```scala
val hattieBsEmptyTables = Nil
```

### you can get the head and tail of a list where the head is the first element of the list and tail is the rest
```scala
val pharmacySuggestions = List("Pharmacy Burger", "Farm Burger", "Curry wurst", "Root beer float")
val firstItem = pharmacySuggestions.head
val everythingAfterwards = pharmacySuggestions.tail
```

### Simple Map example
```scala
val fivePointsPieMenu = Map("Vodka Sauce" -> 25, "Hot Hawaiian" -> 23)  // creates a map of Pizza -> Price
val vodkaSaucePrice = fivePointsPieMenu("Vodka Sauce")                  // 25
val fivePointsUpdatedPieMenu = fivePointsPieMenu + ("T-Rex" -> 25)      // creates new map with T-Rex appended
val danielsFavoritePizzas = fivePointsUpdatedPieMenu - "Hot Hawaiian"   // creates new map without Hot Hawaiian
```

### You create tuples either by using parentheses or using the relation operator
```scala
val danielsFavoriteFivePointsPizza = ("Vodka Sauce", 25)
val pharmacySuggestion = "Pharmacy Burger" -> "Tator Tots"
```

### you can access elements in a tuple using it's index starting with 1
```scala
val pharmacySuggestedEntre = pharmacySuggestion._1  // Pharmacy Burger
val pharmacySuggestedSide = pharmacySuggestion._2   // Tator Tots
```
