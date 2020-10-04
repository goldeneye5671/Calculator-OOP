package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestFourFunctions extends FunSuite{
  val EPSILON: Double = 0.000001


  def equalDoubles(d1: Double, d2: Double): Boolean = {
    //(d1 - d2).abs < EPSILON
    math.abs(d1 - d2) < EPSILON
  }

  test(""){
    val calculator:Calculator = new Calculator()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(1)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(calculator.displayNumber()==11.02)
    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(1)
    calculator.dividePressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(2.50454545, calculator.displayNumber()))
    calculator.clearPressed()
    calculator.numberPressed(2)
    calculator.addPressed()
    calculator.numberPressed(0)
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(calculator.displayNumber() == 7)
    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.subtractPressed()
    calculator.numberPressed(9)
    calculator.numberPressed(9)
    calculator.numberPressed(9)
    calculator.equalsPressed()
    assert(equalDoubles(1, calculator.displayNumber()))
    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.dividePressed()
    calculator.numberPressed(0)
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.numberPressed(6)
    calculator.equalsPressed()
    assert(equalDoubles(1.1627907, calculator.displayNumber()))
    calculator.clearPressed()
    calculator.numberPressed(6)
    calculator.multiplyPressed()
    calculator.numberPressed(6)
    calculator.addPressed()
    calculator.numberPressed(6)
    calculator.equalsPressed()
    assert(equalDoubles(42, calculator.displayNumber()))
  }

}
