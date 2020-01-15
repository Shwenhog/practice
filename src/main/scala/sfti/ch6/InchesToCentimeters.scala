package sfti.ch6

object InchesToCentimeters extends UnitConversion {
  override def convert(in: Double): Double = {
    in * 2.54
  }
}
