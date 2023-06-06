public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        double newReal = this.real + complexNumber.real;
        double newImaginary = this.imaginary + complexNumber.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        double newReal = this.real * complexNumber.real - this.imaginary * complexNumber.imaginary;
        double newImaginary = this.real * complexNumber.imaginary + this.imaginary * complexNumber.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber complexNumber) {
        double denominator = complexNumber.real * complexNumber.real
                + complexNumber.imaginary * complexNumber.imaginary;
        double newReal = (this.real * complexNumber.real + this.imaginary * complexNumber.imaginary) / denominator;
        double newImaginary = (this.imaginary * complexNumber.real - this.real * complexNumber.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public char[] getImaginary() {
        return null;
    }

    public char[] getReal() {
        return null;
    }

    // Геттеры и сеттеры
}
