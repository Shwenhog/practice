package sfti.ch6

object GallonsToLiters extends UnitConversion {
  override def convert(gal: Double): Double = {
    gal * 4.546
  }
}
