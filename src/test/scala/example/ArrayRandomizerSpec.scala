package example

import org.specs2.mutable._

class ArrayRandomizerSpec extends Specification {

  "ArrayRandomizer" should {
    "randomize integers" in {

      def source = Array(1,2,3,4,5,6,7,8,9,10)

      val original = source

      val n = original.length

      val randomized = ArrayRandomizer.randomizeArray(source)

      var same = 0

      (0 to (n - 1)).map(_ match { 

        case i:Int if (original(i) == randomized(i)) => { same = same + 1 }
        case _ => {}

      })

      val threshhold:Double = (n.toDouble / 100.0)

      if (same < threshhold)
        success
      else
        failure("Not random enough")
    }
  }
}
