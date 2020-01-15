package sfti.ch6

import scala.io.StdIn.{ readDouble, readInt }

class Converter {

}
object Converter {
  def main(args: Array[String]): Unit = {
    loopOptions(true)
  }
  
  def loopOptions(isRunning: Boolean): Double = {
    if (isRunning) {
      printOptions()
      val selection = readInt()
      if (selection == 4) {
        println("Exiting")
        loopOptions(false)
      }
      else {
        println("To stop using this conversion enter '0'")
        loopConversion(selection)
        loopOptions(true)
      }
    } else {
      0
    }
  }
  
  def loopConversion(selection: Int): Unit = {
    selection match {
      case 1 =>
        println("Converting inches to centimeters")
        doConversion(1)
      case 2 =>
        println("Converting gallons to liters")
        doConversion(2)
      case 3 =>
        println("Converting miles to kilometers")
        doConversion(3)
    }
  }
  
  def printResults(input: Double, unitIn: String, output: Double, unitOut: String) = {
    println(input + unitIn + " = " + output + unitOut)
  }
  
  
  def doConversion(selection: Int): Unit = {
    val input = readDouble()
    selection match {
      case 1 =>
        val result = InchesToCentimeters.convert(input)
        printResults(input, "in", result, "cm")
      case 2 =>
        val result = GallonsToLiters.convert(input)
        printResults(input, "gal", result, "l")
      case 3 =>
        val result = MilesToKilometers.convert(input)
        printResults(input, "mi", result, "km")
    }
    if ( input != 0 ) {
      doConversion(selection)
    } else {
      println("------------------------------")
    }
  }
  
  def printOptions() = {
    println(
      "Select an option by its number" +
        "\n 1: Inches to centimeters" +
        "\n 2: Gallons to liters" +
        "\n 3: Miles to kilometers" +
        "\n 4: Exit"
    )
  }
}
