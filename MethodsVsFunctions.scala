//there's a subtle but important different between methods and functions
class Paladin {
  def greet() = { println("Well met!") }
  val threaten = () => { println("Justice demands retribution!") }
}

val p = new Paladin()
p.greet
println(p.threaten)
p.threaten()
