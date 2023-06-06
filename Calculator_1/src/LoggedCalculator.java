package Calculator_1.src;

import Calculator_1.Interface.Calculator;
import Calculator_1.Interface.CalculatorLogger;
import Calculator_1.Interface.ComplexNumber;

public class LoggedCalculator implements CalculatorLogger {
  private Calculator calculator;
  private CalculatorLogger logger;

  public LoggedCalculator(Calculator calculator, CalculatorLogger logger) {
    this.calculator = calculator;
    this.logger = logger;
  }

  @Override
  public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = calculator.add(num1, num2);
    logger.log("Added " + num1 + " and " + num2 + " to get " + result);
    return result;
  }

  @Override
  public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = calculator.subtract(num1, num2);
    logger.log("Subtracted " + num2 + " from " + num1 + " to get " + result);
    return result;
  }

  @Override
  public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = calculator.multiply(num1, num2);
    logger.log("Multiplied " + num1 + " and " + num2 + " to get " + result);
    return result;
  }

  @Override
  public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = calculator.divide(num1, num2);
    logger.log("Divided " + num1 + " by " + num2 + " to get " + result);
    return result;
  }
}