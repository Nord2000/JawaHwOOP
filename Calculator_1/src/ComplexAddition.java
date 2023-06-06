package Calculator_1.src;

import Calculator_1.Interface.Addition;
import Calculator_1.Interface.ComplexNumber;
import Calculator_1.Interface.ComplexNumberFactory;

public class ComplexAddition implements Addition {
  private ComplexNumberFactory factory;

  public ComplexAddition(ComplexNumberFactory factory) {
    this.factory = factory;
  }

  @Override
  public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
    ComplexNumber result = factory.createNumber(num1.getReal() + num2.getReal(),
        num1.getImaginary() + num2.getImaginary());
    return result;
  }
}
