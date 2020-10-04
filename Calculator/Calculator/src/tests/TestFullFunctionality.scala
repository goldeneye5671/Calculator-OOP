package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestFullFunctionality extends FunSuite{
  val EPSILON: Double = 0.0000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    //(d1 - d2).abs < EPSILON
    math.abs(d1 - d2) < EPSILON
  }

  test(""){
    val calculator = new Calculator()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(1)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(calculator.displayNumber()==11.02)
    calculator.addPressed()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(1)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 36.366), calculator.displayNumber())
    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.decimalPressed()
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 3.0))
    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    calculator.dividePressed()
    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.subtractPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(70, calculator.displayNumber()))
    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(5)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.numberPressed(0)
    calculator.addPressed()
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 70))
  }
}
