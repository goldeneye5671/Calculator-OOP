package calculator.model

class RHSADD(myCalculator:Calculator) extends DefaultState (myCalculator){
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
    myCalculator.LHSnumber = myCalculator.LHSnumber + myCalculator.RHS.mkString("").toDouble
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new RHSDIV(myCalculator)
  }

  override def multiplyPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHSnumber + myCalculator.RHS.mkString("").toDouble
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new RHSMUL(myCalculator)
  }

  override def subtractPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHSnumber + myCalculator.RHS.mkString("").toDouble
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new RHSSUB(myCalculator)
  }

  override def addPressed(): Unit = {
    myCalculator.LHSnumber = myCalculator.LHSnumber + myCalculator.RHS.mkString("").toDouble
    myCalculator.RHS = List[String]("0")
    myCalculator.myState = new RHSADD(myCalculator)
  }

  override def equalsPressed(): Unit = {
    myCalculator.number = myCalculator.LHSnumber + myCalculator.RHS.mkString("").toDouble
    myCalculator.myState = new END(myCalculator)
  }

  override def decimalPressed(): Unit = {
    myCalculator.RHS = myCalculator.RHS :+ "."
    myCalculator.prevRHSState = myCalculator.myState
    myCalculator.myState = new RHSDEC(myCalculator)
  }
}

