package calculator.model

abstract class DefaultState (myCalculator:Calculator) {
  def displayNumber(): Double

  /*
  * resets both lists and resets the state
   */
  def clearPressed(): Unit

  //  Adds the following number to the list of numbers. Need a state variable to determine if it needs to be added to the
  //  left list or the right list
  def numberPressed(number: Int): Unit

  /*
  The operation buttons will change the state of the class.
   */

  def dividePressed(): Unit

  def multiplyPressed(): Unit

  def subtractPressed(): Unit

  def addPressed(): Unit

  def equalsPressed(): Unit

  def decimalPressed(): Unit
}
