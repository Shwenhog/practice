package sfti.ch6

class Point(xCoOrd: Int, yCoOrd: Int) {
  val x = xCoOrd
  val y = yCoOrd
}

object Point {
  def apply(x:Int, y:Int): Point = {
    new Point(x, y)
  }
}
