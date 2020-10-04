package calculator.model

class LHS (myCalculator:Calculator) extends DefaultState (myCalculator){
  override def displayNumber(): Double = {
    return myCalculator.LHS.mkString("").toDouble
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
    myCalculator.LHSnumber = myCalculator.LHS.mkString("").toDouble
    myCalculator.myState = new RHSDIV(myCalculator)
  }

  override def multiplyPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHS.mkString("").toDouble
    myCalculator.myState = new RHSMUL(myCalculator)
  }

  override def subtractPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHS.mkString("").toDouble
    myCalculator.myState = new RHSSUB(myCalculator)
  }

  override def addPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHS.mkString("").toDouble
    myCalculator.myState = new RHSADD(myCalculator)
  }

  override def equalsPressed(): Unit = {}

  override def decimalPressed(): Unit = {
    myCalculator.LHS = myCalculator.LHS :+ "."
    myCalculator.myState = new LHSDEC(myCalculator)
  }
}
