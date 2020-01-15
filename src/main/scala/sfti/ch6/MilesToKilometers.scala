package sfti.ch6

object MilesToKilometers extends UnitConversion {
  override def convert(mi: Double): Double = {
    mi * 1.609
  }
}
