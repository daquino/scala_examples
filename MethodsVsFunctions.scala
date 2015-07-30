//there's a subtle but important different between methods and functions
class Paladin {
  def greet() = { println("Well met!") }
  val threaten = () => { println("Justice demands retribution!") }
}

val p = new Paladin()
println(p.greet)
println(p.threaten)
p.greet
p.threaten()
