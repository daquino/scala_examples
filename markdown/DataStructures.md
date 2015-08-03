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

### You can also create array with the Array(...) factory method
```scala
val chipotleSaladIngredients = Array("Lettuce", "Chicken", "Chicken", "Fajita Veggies", "Corn", "Cheese", "Guac")
```

### List also has a factor method
```scala
val fivePointsBeers = List("Calfkiller", "Jackalope Bearwalker", "Einstok Pale Ale")
```

### Nil can represent the empty list
```scala
val hattieBsEmptyTables = Nil
```

### you can use the ::(cons) operator and Nil to define a list
```scala
val hattieBsHeatLevels = "Southern Heat" :: "Mild or Medium" :: "Hot" :: "Damn Hot" :: "Shut the cluck up" :: Nil
```

### you can get the head and tail of a list where the head is the first element of the list and tail is the rest
```scala
val pharmacySuggestions = List("Pharmacy Burger", "Farm Burger", "Curry wurst", "Rootbeer Float")
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

### Inclusive or exclusive ranges
```scala
val chipotlePriceRange = 9 to 12
val hattieBsPriceRange = 9 until 12
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
