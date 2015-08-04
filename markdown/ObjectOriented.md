# Object-Oriented Programming

### defining a simple class
```scala
class Animal(animalType: String) {
  def this() = this("Unknown")
  override def toString() =  s"${animalType}"
}

val dog = new Animal("dog")
val cat = new Animal("cat")
println(dog)
println(cat)
```

### subclassing
```scala
class Horse extends Animal("horse")
val horse = new Horse
println(horse)
```

### exposing constructor parameters
```scala
class ImmutableAnimal(val animalType: String) extends Animal(animalType)
class MutableAnimal(var animalType: String) extends Animal(animalType)

val monkey = new ImmutableAnimal("monkey")
println(monkey.animalType)

val animal = new MutableAnimal("lion")
animal.animalType = "mountain lion"
println(animal.animalType)
```

### here's an example of an abstract class
```scala
abstract class AbstractAnimal(animalType: String) {
  def greet()
  override def toString() = animalType
}

class Elephant extends AbstractAnimal("elephant") {
  override def greet() = {
    println(s"The ${this} goes toot.")
  }
}

val elephant = new Elephant
elephant.greet()
```

### Use traits for multiple inheritance
```scala
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
```

### inheriting from multiple traits
```scala
trait Legs extends Movable {
  override def move() = {
    println(s"The ${this} is running.")
  }
  def walk() = {
    println(s"The ${this} is walking.")
  }
}
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
eagle.takeFlight

//multiple inheritance during instantiation
val caique = new Animal("caique") with Wings with Legs
caique.move
caique.walk
caique.takeFlight
```
