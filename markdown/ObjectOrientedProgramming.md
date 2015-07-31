# Object-Oriented Programming

### defining a simple class
```scala
class Animal(name: String) {
  def this() = this("Unknown")
  override def toString() =  s"${name}"
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

### read-only instance variable
```scala
class ImmutableAnimal(val name: String) extends Animal(name)

val monkey = new ImmutableAnimal("monkey")
println(monkey.name)
```

### instance variable
```scala
class MutableAnimal(var name: String) extends Animal(name)

val animal = new MutableAnimal("lion")
animal.name = "mountain lion"
println(animal.name)
```

### here's an example of an abstract class
```scala
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
```

### use objects to replace static members
```scala
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

### you can apply traits during instantiation
```scala
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
```

### inheriting from multiple traits
```scala
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

val caique = new Animal("caique") with Wings with Legs
caique.move
caique.takeFlight
```

### you can stack traits to compose functionality
```scala
import scala.collection.mutable.ArrayBuffer
abstract class Queue[T] {
  def get(): T
  def put(item: T)
}

class IntQueue extends Queue[Int] {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(item: Int) = buf += item
}

val queue = new IntQueue
queue.put(1)
queue.put(2)
println(queue.get)  // 1
println(queue.get)  // 2

trait Doubling extends Queue[Int] {
  abstract override def put(item: Int) = super.put(item * 2)
}

trait Incrementing extends Queue[Int] {
  abstract override def put(item: Int) = super.put(item + 1)
}

val doublingQueue = new IntQueue with Doubling
doublingQueue.put(1)
doublingQueue.put(2)
println(doublingQueue.get)  // 2
println(doublingQueue.get)  // 4

val incrementingDoubleQueue = new IntQueue with Doubling with Incrementing
incrementingDoubleQueue.put(1)
incrementingDoubleQueue.put(2)
println(incrementingDoubleQueue.get)  // 4
println(incrementingDoubleQueue.get)  // 6
```
