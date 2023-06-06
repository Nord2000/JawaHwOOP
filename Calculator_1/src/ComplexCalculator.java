package Calculator_1.src;

import Calculator_1.Interface.Calculator;
import Calculator_1.Interface.ComplexNumber;
import Calculator_1.Interface.ComplexNumberFactory;

public class ComplexCalculator implements Calculator {
  private ComplexNumberFactory factory;

  public ComplexCalculator(ComplexNumberFactory factory) {
    this.factory = factory;
  }

  @Override
  public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = factory.createNumber(num1.getReal() + num2.getReal(),
        num1.getImaginary() + num2.getImaginary());
    return result;
  }

  @Override
  public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = factory.createNumber(num1.getReal() - num2.getReal(),
        num1.getImaginary() - num2.getImaginary());
    return result;
  }

  @Override
  public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
    double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
    double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
    ComplexNumber result = factory.createNumber(real, imaginary);
    return result;
  }

  @Override
  public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
    double divisor = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
    double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / divisor;
    double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / divisor;
    ComplexNumber result = factory.createNumber(real, imaginary);
    return result;
  }
}