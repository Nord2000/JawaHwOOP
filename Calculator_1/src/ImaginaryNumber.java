package Calculator_1.src;

import Calculator_1.Interface.ComplexNumber;

public class ImaginaryNumber implements ComplexNumber {
    private double imaginary;

    public ImaginaryNumber(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return 0;
    }

    @Override
    public double getImaginary() {
        return imaginary;
    }
}
