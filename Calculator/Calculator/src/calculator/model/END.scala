package calculator.model

class END (myCalculator:Calculator) extends DefaultState (myCalculator){
  override def displayNumber(): Double = {
    myCalculator.number
  }

  override def clearPressed(): Unit = {
    myCalculator.LHS = List[String]("0")
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new LHS(myCalculator)
  }

  override def numberPressed(number: Int): Unit = {
    myCalculator.LHS = myCalculator.LHS :+ number.toString
  }

  override def dividePressed(): Unit = {
    myCalculator.RHS = List[String]("0")
    myCalculator.LHSnumber = myCalculator.number
    myCalculator.myState = new RHSDIV(myCalculator)
  }

  override def multiplyPressed(): Unit = {
    myCalculator.RHS = List[String]("0")
    myCalculator.LHSnumber = myCalculator.number
    myCalculator.myState = new RHSMUL(myCalculator)
  }
  override def subtractPressed(): Unit = {
    myCalculator.RHS = List[String]("0")
    myCalculator.LHSnumber = myCalculator.number
    myCalculator.myState = new RHSSUB(myCalculator)
  }

  override def addPressed(): Unit = {
    myCalculator.RHS = List[String]("0")
    myCalculator.LHSnumber = myCalculator.number
    myCalculator.myState = new RHSADD(myCalculator)
  }

  override def equalsPressed(): Unit = {}

  override def decimalPressed(): Unit = {
  }
}