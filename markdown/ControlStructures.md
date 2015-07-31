# Control Structures

### Simple if expression
```scala
if(superHero == "Spider Man") println(s"${superHero} is Peter Parker\n")
```

### if-elseif-else
```scala
superHero = "Wolverine"

//if-else if-else
if(superHero == "Batman") {
  println("Name: Bruce Wayne")
  println("Team: Justice League")
}
else if (superHero == "Wolverine") {
  println("Name: James Howlett")
  println("Team: X-Men")
}
else {
  println("Name: ?????")
  println("Team: ?????")
}
```


### if else structures are expressions
```scala
//if-elseif-else as an expression
val alias = "The Flash"
val identity = if (alias == "Green Arrow") {
  "Oliver Queen"
}
else if(alias == "The Flash") {
  "Barry Allen"
}
else {
  "Who?"
}
```

### simple while loop
```scala
var i = 0
var superHeroes = Array[String]("Superman", "Wonder Woman", "Thor", "Iron Man",
  "Black Widow", "The Hulk", "Green Lantern")
while(i < superHeroes.length) {
  println(s"${superHeroes(i)}")
  i += 1;
}
```

### do-while loop
```scala
i = 0
val superHeroIdentities = Array[String]("Clark Kent", "Diana Prince",
  "Thor Odinson", "Tony Stark", "Natasha Romanova", "Bruce Banner",
  "Alan Scott")
do {
  println(s"${superHeroIdentities(i)}")
  i += 1;
} while(i < superHeroes.length)
```


### for comprehension (for loop)
```scala
val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"),
  ("Black Widow", "Avengers"), ("Gambit", "X-Men"),
  ("Green Lantern", "Justice League"))

for(heroProfile <- heroProfiles) {
  print(s"${heroProfile._1}, ")
  print(s"${heroProfile._2}\n")
}
```

### filtering with for comprehension
```scala
val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"),
  ("Black Widow", "Avengers"), ("Gambit", "X-Men"),
  ("Green Lantern", "Justice League"))

for(heroProfile <- heroProfiles
    if heroProfile._2.contains("Avengers")
   )
  println(s"${heroProfile._1}, ${heroProfile._2}")
```

### variable binding with for comprehensions
```scala
val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"),
  ("Black Widow", "Avengers"), ("Gambit", "X-Men"),
  ("Green Lantern", "Justice League"))

for{heroProfile <- heroProfiles
    heroName = heroProfile._1.toUpperCase()}
  println(s"${heroName}!!!")
```


### yielding in for comprehensions to create a new collection
```scala
val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"),
  ("Black Widow", "Avengers"), ("Gambit", "X-Men"),
  ("Green Lantern", "Justice League"))

var justiceLeagueMembers = for{
  heroProfile <- heroProfiles
  if heroProfile._2.contains("Justice League")
} yield heroProfile
```

### try expression
```scala
var heroes = Array[String]("Human Torch", "Thing")
try {
  println(heroes(2))
}
catch {
  case ioe:java.io.IOException => println("IOException!!")
  case npe:NullPointerException => println("NullPointerException!!")
  case iobe:java.lang.IndexOutOfBoundsException => println("IndexOutOfBoundsException!!")
}
finally {
  println("Printed always just like a java finally block")
}
```

### match expression
```scala
val heroWeaknesses = List(("Iron Man", "Crippled Heart"), ("Superman", "kryptonite"),
  ("Green Lantern", "the color yellow"))
for(heroWeakness <- heroWeaknesses) {
  heroWeakness match {
    case (name, "Crippled Heart") => println(s"A crippled heart is also one of ${name}'s strengths")
    case (name, weakness) => println(s"${name} is weak against ${weakness}.")
  }
}
```