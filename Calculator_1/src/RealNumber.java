package Calculator_1.src;

import Calculator_1.Interface.ComplexNumber;

public class RealNumber implements ComplexNumber {
  private double real;

  public RealNumber(double real) {
    this.real = real;
  }

  @Override
  public double getReal() {
    return real;
  }

  @Override
  public double getImaginary() {
    return 0;
  }
}
