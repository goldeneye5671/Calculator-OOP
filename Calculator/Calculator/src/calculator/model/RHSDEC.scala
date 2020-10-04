package calculator.model

class RHSDEC (myCalculator:Calculator) extends DefaultState (myCalculator) {
  override def displayNumber(): Double = {
    myCalculator.RHS.mkString("").toDouble
  }

  override def clearPressed(): Unit = {
    myCalculator.LHS = List[String]("0")
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new LHS(myCalculator)
  }

  override def numberPressed(number: Int): Unit = {
    myCalculator.RHS = myCalculator.RHS :+ number.toString
  }

  override def dividePressed(): Unit = {
    myCalculator.prevRHSState.dividePressed()
  }

  override def multiplyPressed(): Unit = {
    myCalculator.prevRHSState.multiplyPressed()
  }

  override def subtractPressed(): Unit = {
    myCalculator.prevRHSState.subtractPressed()
  }

  override def addPressed(): Unit = {
    myCalculator.prevRHSState.addPressed()
  }

  override def equalsPressed(): Unit = {
    myCalculator.prevRHSState.equalsPressed()
  }

  override def decimalPressed(): Unit = {}
}