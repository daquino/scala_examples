//trait stacking
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
println(queue.get)
println(queue.get)

trait Doubling extends Queue[Int] {
  abstract override def put(item: Int) = super.put(item * 2)
}

trait Incrementing extends Queue[Int] {
  abstract override def put(item: Int) = super.put(item + 1)
}

val doublingQueue = new IntQueue with Doubling
doublingQueue.put(1)
doublingQueue.put(2)
println(doublingQueue.get)
println(doublingQueue.get)

val incrementingDoubleQueue = new IntQueue with Doubling with Incrementing
incrementingDoubleQueue.put(1)
incrementingDoubleQueue.put(2)
println(incrementingDoubleQueue.get)
println(incrementingDoubleQueue.get)
