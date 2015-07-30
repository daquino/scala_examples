//defining a simple class
class Animal(name: String) {
  def this() = this("Unknown")
  override def toString() =  s"${name}"
}

val dog = new Animal("dog")
val cat = new Animal("cat")
println(dog)
println(cat)


//subclassing
class Horse extends Animal("horse")
val horse = new Horse
println(horse)

//read-only instance variable
class ImmutableAnimal(val name: String) extends Animal(name)

val monkey = new ImmutableAnimal("monkey")
println(monkey.name)

// instance variable
class MutableAnimal(var name: String) extends Animal(name)

val animal = new MutableAnimal("lion")
animal.name = "mountain lion"
println(animal.name)

//here's an example of an abstract class
abstract class AbstractAnimal(name: String) {
  def greet()
  override def toString() = name
}

class Elephant extends AbstractAnimal("elephant") {
  override def greet() = {
    println(s"The ${this} goes toot.")
  }
}

val elephant = new Elephant
elephant.greet()

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

//use objects to replace static members
class Monkey extends Animal("monkey") {
  def eat() = {
    if(Monkey.bananas > 0) {
      Monkey.bananas -= 1
      println(s"A monkey ate a banana. ${Monkey.bananas} bananas left.")
    }
    else {
      println("Ran out of bananas")
    }
  }
}

object Monkey {
  var bananas = 2;
}

val monkey1 = new Monkey
val monkey2 = new Monkey
monkey1.eat()
monkey2.eat()
monkey2.eat()
