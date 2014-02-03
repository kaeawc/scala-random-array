package example

import scala.util.Random

object ArrayRandomizer {

  def randomizeArray[T](array:Array[T]):Array[T] = {

    val random = new Random()

    var i = 0

    while (i < (array.length - 1)) {

      val last = array.length - (1 + i)

      val grab = random.nextInt(last)

      val hold = array(grab)
      array(grab) = array(last)
      array(last) = hold

      i = i + 1
    }

    array
  }
}
