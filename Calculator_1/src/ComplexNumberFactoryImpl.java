package Calculator_1.src;

import Calculator_1.Interface.ComplexNumber;
import Calculator_1.Interface.ComplexNumberFactory;

public class ComplexNumberFactoryImpl implements ComplexNumberFactory {
  @Override
  public ComplexNumber createNumber(double real, double imaginary) {
    if (real != 0) {
      return new RealNumber(real);
    } else {
      return new ImaginaryNumber(imaginary);
    }
  }
}