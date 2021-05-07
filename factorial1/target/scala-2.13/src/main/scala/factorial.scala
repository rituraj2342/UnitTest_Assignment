import com.sun.source.doctree.IndexTree

import scala.collection.immutable.Range

class factorial  {

  def fact(n: Int): Int = {
    var f = 1
    for (i <- 1 to n) {
      f = f * i
    }
    return f :Int
  }
}
