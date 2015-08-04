import scala.util.Random
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

val generateNumber = () => {
  val seconds = new Random().nextInt(5)+1
  println(s"Sleeping for ${seconds} seconds")
  Thread.sleep(seconds * 1000)
  println(s"Waking up after ${seconds} seconds")
  seconds
}

val future1 = Future {
  generateNumber()
}
val future2 = Future {
  generateNumber()
}

val future3 = for{
  r1 <- future1
  r2 <- future2
} yield {
  (r1, r2)
}

future3 onSuccess {
  case seconds => println(s"Thread 1 slept for ${seconds._1} seconds and future 2 slept for ${seconds._2} seconds.")
}

Await.result(future3, 20 seconds)
