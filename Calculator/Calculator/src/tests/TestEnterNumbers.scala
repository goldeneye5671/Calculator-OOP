package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(0)
    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(3)
    calculator.numberPressed(4)
    calculator.numberPressed(5)
    calculator.numberPressed(6)
    calculator.numberPressed(7)
    calculator.numberPressed(8)
    calculator.numberPressed(9)
    calculator.numberPressed(0)
    calculator.numberPressed(3)
    assert(equalDoubles(calculator.displayNumber(), 125.12345678903), calculator.displayNumber())
    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(7)
    calculator.numberPressed(8)
    calculator.numberPressed(9)
    calculator.numberPressed(7)
    calculator.numberPressed(1)
    assert(equalDoubles(0.78971, calculator.displayNumber()))
    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(0)
    assert(equalDoubles(50, calculator.displayNumber()))
  }

}
