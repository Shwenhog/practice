package sfti.ch6

class EnumTesting {

}
object EnumTesting {
  def main(args: Array[String]): Unit = {
    println(Suits.Diamond.toString + Suits.isRed(Suits.Diamond))
    println(Suits.Club.toString + Suits.isRed(Suits.Club))
    println(Suits.Heart.toString + Suits.isRed(Suits.Heart))
    println(Suits.Spade.toString + Suits.isRed(Suits.Spade))
  }
}
