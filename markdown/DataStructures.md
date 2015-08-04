# Data Structures

### Vectors can be used as immutable indexed sequences
```scala
val lunchOptions = Vector("Chipotle", "Five Points Pizza", "Hattie B's", "The Pharmacy Burger Parlor and Beer Garden")

//use +: to prepend to the Vector
val prependedLunchOptions = "Peg Leg Porker" +: lunchOptions

//use :+ to append an item to the Vector
val appendedLunchOptions = prependedLunchOptions :+ "Bakersfield"

//use the updated method to create a new vector with the item at the specified index updated
val updatedLunchOptions = appendedLunchOptions.updated(0, "Samurai Sushi")

//access elements of the Vector using ()
val fridayLunch = appendedLunchOptions(2)
```

### The easiest way to create a list is by using the List() factory method
```scala
val fivePointsBeers = List("Einstok Pale Ale", "Calfkiller", "Jackalope Bearwalker")

//you can access the head and tail of a List
val firstBeer = fivePointsBeers.head
val everythingAfterwards = fivePointsBeers.tail
```

### Nil can represent the empty list
```scala
val chipotleAvailableParkingSpots = Nil
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
val pharmacySuggestion = ("Pharmacy Burger", "Tator tots")
```

### you can access elements in a tuple using it's index starting with 1
```scala
val pharmacySuggestedEntre = pharmacySuggestion._1  // Pharmacy Burger
val pharmacySuggestedSide = pharmacySuggestion._2   // Tator Tots
```
