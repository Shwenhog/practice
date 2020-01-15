package sfti.ch6

class Suits {

}

object Suits extends Enumeration {
  val Diamond = Value("♦")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Spade = Value("♠")
  
  def isRed(suit: Value): Boolean = {
    suit match {
      case Diamond => true
      case Club => false
      case Heart => true
      case Spade => false
    }
  }
}
