//defining a simple class
class Animal(name: String) {
  def this() = this("Unknown")
  override def toString(): String = { return s"${name}" }
}

val dog = new Animal("dog")
val cat = new Animal("cat")
println(dog)
println(cat)

//subclassing
class Horse extends Animal("horse")
val horse = new Horse
println(horse)

//traits
trait Movable {
  def move()
}

class Bird extends Animal("bird") with Movable {
  override def move() = {
    println(s"The ${this} is flying.")
  }
}

val bird = new Bird
bird.move

//traits during instantiation
class Tiger extends Animal("tiger")
class Dolphin extends Animal("dolphin")
trait Legs extends Movable {
  override def move() = {
    println(s"The ${this} is running.")
  }
  def walk() = {
    println(s"The ${this} is walking.")
  }
}
trait Fins extends Movable {
  override def move()  {
    println(s"The ${this} is swimming.")
  }
}

val tiger = new Tiger with Legs
val dolphin = new Dolphin with Fins
tiger.move
dolphin.move


//multiple inheritance
trait Wings extends Movable {
  override def move = {
    println(s"The ${this} is flying.")
  }
  def takeFlight = {
    println(s"The ${this} is taking flight.")
  }
}
class Eagle extends Animal("eagle") with Legs with Wings

val eagle = new Eagle
eagle.move
eagle.walk

//multiple inheritance during instantiation
val caique = new Animal("caique") with Wings with Legs
caique.move
caique.takeFlight
