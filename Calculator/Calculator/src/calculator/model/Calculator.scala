package calculator.model

class Calculator() {

  var LHS:List[String] = List("0")
  var RHS:List[String] = List("0")
  var prevRHSState:DefaultState = new LHS(this)
  var LHSnumber:Double = 0
  var number:Double = 0
  var myState:DefaultState = new LHS(this)

  // Accessed by View. You should edit this method as you build functionality
  /*
   *  It seems like the calculator will have 2 lists that will contain the numbers on the LeftHandSide
   * and the RightHandSide. These lists will be how a number is displayed and added to on the display.
   *
   * It also seems like when the button is cleared the lists should be reinstantiated, as well as when
   * the equals button is pressed.
   *
   * When an operator button is pressed, it seems like we are supposed to either add that to its own list
   * or add it to the end of the LeftHandSide list. We will look for it using get or else function of the list
   * class.
   *
   * There are some things we have to look out for though. If the user makes a mistake when entering info into the calculator
   * we should not execute anything or print error to the display. The documentation is very clear about this. DO NOT TEST TFOR
   * UNDEFINED INPUTS!!!!!
   *
   * When the operator button is pressed it seems like we will have to have a state change so that the program
   * knows to add to the RightHandSide list.
   *
   * if the user does something like 3*4, the display will show 12. If they click an operator directly following pressing
   * the equals button, we must put the number into the left hand side variable
   */
  def displayNumber(): Double = {
    return myState.displayNumber()
  }

  /*
  * resets both lists and resets the state
   */
  def clearPressed(): Unit = {
    myState.clearPressed()
  }

  //  Adds the following number to the list of numbers. Need a state variable to determine if it needs to be added to the
  //  left list or the right list
  def numberPressed(number: Int): Unit = {
    myState.numberPressed(number)
  }

  /*
  The operation buttons will change the state of the class.
   */

  def dividePressed(): Unit = {
    myState.dividePressed()
  }

  def multiplyPressed(): Unit = {
    myState.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    myState.subtractPressed()
  }

  def addPressed(): Unit = {
    myState.addPressed()
  }

  def equalsPressed(): Unit = {
    myState.equalsPressed()
  }

  def decimalPressed(): Unit = {
    myState.decimalPressed()
  }
}
