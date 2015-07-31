# Data Structures

### Arrays can be defined by size and have each element assigned one by one
```scala
var lunchOptions = new Array[String](4)
lunchOptions(0) = "Chipotle"
lunchOptions(1) = "Five Points Pizza"
lunchOptions(2) = "Hattie B's"
lunchOptions(3) = "The Pharmacy Burger Parlor and Beer Garden"
printItems("Where do you want to eat?", lunchOptions)
```

### or you can define an array and it's values all at once
```scala
val chipotleSaladIngredients = Array("Lettuce", "Chicken", "Chicken", "Fajita Veggies", "Corn", "Cheese", "Guac")
```

### you can create a List the traditional way
```scala
val chiptoleParkingSpots: List[Nothing] = List()
```

### or you can create a List with values
```scala
val fivePointsBeers = List("Calfkiller", "Jackalope Bearwalker", "Einstok Pale Ale")
```

### you can create an empty list with Nil
```scala
val hattieBsEmptyTables = Nil
```

### you can use the ::(cons) operator and Nil to define a list
```scala
val hattieBsHeatLevels = "Southern Heat" :: "Mild or Medium" :: "Hot" :: "Damn Hot" :: "Shut the cluck up" :: Nil
```

### you can get the head and tail of a list where the head is the first element of the list and tail is the rest
```scala
val pharmacySuggestions = "Pharmacy Burger" :: "Farm Burger" :: "Curry wurst" :: "Rootbeer Float" :: Nil
val firstItem = pharmacySuggestions.head
val everythingAfterwards = pharmacySuggestions.tail
```

### you can make a range with the to keyword
```scala
val chipotlePriceRange = 9 to 12
```

### you can make a range with until to make the upper limit exclusive
```scala
val hattieBsPriceRange = 9 until 12
```

### tuples can be created with values separate by commas surrounded by parentheses
```scala
val danielsFavoriteFivePointsPizza = ("Vodka Sauce", 25)
```

### or you can create a tuple using the relation operator ->
```scala
val pharmacySuggestion = "Pharmacy Burger" -> "Tator Tots"
```

### you can access elements in a tuple using it's index starting with 1
```scala
val pharmacySuggestedEntre = pharmacySuggestion._1  // Pharmacy Burger
val pharmacySuggestedSide = pharmacySuggestion._2   // Tator Tots
```
