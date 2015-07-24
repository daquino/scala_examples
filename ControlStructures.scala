var superHero = "Spider Man"

//simple if
if(superHero == "Spider Man") println(s"${superHero} is Peter Parker\n")

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
println

//while loop
var i = 0
var superHeroes = Array[String]("Superman", "Wonder Woman", "Thor", "Iron Man", "Black Widow", "The Hulk", "Green Lantern")
while(i < superHeroes.length) {
  println(s"${superHeroes(i)}")
  i += 1;
}
println

//do-while loop
println
i = 0
val superHeroIdentities = Array[String]("Clark Kent", "Diana Prince", "Thor Odinson", "Tony Stark", "Natasha Romanova", "Bruce Banner", "Alan Scott")
do {
  println(s"${superHeroIdentities(i)}")
  i += 1;
} while(i < superHeroes.length)
println

//for expression..notice that the first println is the only expression in the loop
val heroProfiles = List(("Batman", "Justice League"), ("Iron Man", "Avengers"), ("Black Widow", "Avengers"), ("Gambit", "X-Men"), ("Green Lantern", "Justice League"))
for(heroProfile <- heroProfiles) {
  print(s"${heroProfile._1}, ")
  print(s"${heroProfile._2}\n")
}
println

//for expression filter
for(heroProfile <- heroProfiles
    if heroProfile._2.contains("Avengers")
   )
  println(s"${heroProfile._1}, ${heroProfile._2}")
println

//for expression variable binding
for{heroProfile <- heroProfiles
    heroName = heroProfile._1.toUpperCase()}
  println(s"${heroName}!!!")
println

//for expression yielding can generate new collections
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
val heroWeakness = ("Iron Man", "Crippled Heart")
heroWeakness match {
  case (name, "Crippled Heart") => println(s"A crippled heart is also one of ${name}'s strengths")
  case (name, weakness) => println(s"${name} is weak against ${weakness}")
}
