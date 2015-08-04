//if-elseif-else as an expression
val superHeroName = "The Flash"
val identity = if (superHeroName == "Green Arrow") {
  "Oliver Queen"
}
else if(superHeroName == "The Flash") {
  "Barry Allen"
}
else {
  "Who?"
}
println(s"Identity = ${identity}\n")

//while loop
var i = 0
var superHeroes = Array[String]("Superman", "Wonder Woman", "Thor", "Iron Man",
  "Black Widow", "The Hulk", "Green Lantern")
while(i < superHeroes.length) {
  println(s"${superHeroes(i)}")
  i += 1;
}
println

val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"),
  ("Black Widow", "Avengers"), ("Gambit", "X-Men"),
  ("Green Lantern", "Justice League"))

//for comprehension
for(heroProfile <- heroProfiles) {
  print(s"${heroProfile._1}, ")
  print(s"${heroProfile._2}\n")
}
println

//for comprehension filter
for(heroProfile <- heroProfiles
    if heroProfile._2.contains("Avengers")
   )
  println(s"${heroProfile._1}, ${heroProfile._2}")
println

//for comprehension variable binding
for{heroProfile <- heroProfiles
    heroName = heroProfile._1.toUpperCase()}
  println(s"${heroName}!!!")
println

//for comprehension yielding can generate new collections
var justiceLeagueMembers = for{
  heroProfile <- heroProfiles
  if heroProfile._2.contains("Justice League")
} yield heroProfile

println(justiceLeagueMembers)

//try expressions
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
println

//match expressions
val heroWeaknesses = List(("Iron Man", "Crippled Heart"), ("Superman", "kryptonite"),
  ("Green Lantern", "the color yellow"))
for(heroWeakness <- heroWeaknesses) {
  heroWeakness match {
    case (name, "Crippled Heart") => println(s"A crippled heart is also one of ${name}'s strengths")
    case (name, weakness) => println(s"${name} is weak against ${weakness}.")
  }
}
