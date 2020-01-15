package sfti.ch6

import org.scalatest.{ FlatSpec, Matchers }
import Suits._

class SuitsSpec extends FlatSpec with Matchers {
  
  "toString" should "return the symbol of each suit" in {
    val actual = Diamond.toString + Club.toString + Heart.toString + Spade.toString
    val expected = "♦♣♥♠"
    
    actual shouldEqual expected
  }
  
  "isRed" should "return true for Diamond and Heart and false for Club and Spade" in {
    val actual = Array(
      Suits.isRed(Diamond),
      Suits.isRed(Club),
      Suits.isRed(Heart),
      Suits.isRed(Spade)
    )
    val expected = Array(
      true,
      false,
      true,
      false
    )
    
    actual shouldEqual expected
  }
  
}
