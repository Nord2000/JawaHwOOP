import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import Calculator.Interface.ILogger;

public class CalculatorGUI extends JFrame implements AncestorListener {
    private JButton addButton, multiplyButton, divideButton;
    private JTextField num1RealField, num1ImaginaryField, num2RealField, num2ImaginaryField, resultRealField,
            resultImaginaryField;
    private JLabel plusLabel, iLabel1, iLabel2, equalsLabel;
    private Calculator calculator;
    private ILogger logger;
    private static final int GUI_WIDTH = 400;
    private static final int GUI_HEIGHT = 200;

    public CalculatorGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Complex Number Calculator");
        setSize(GUI_WIDTH, GUI_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);

        calculator = new Calculator();
        CalculatorLoggerFactory loggerFactory = new CalculatorLoggerFactory();
        logger = loggerFactory.getLogger();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 5, 5));

        num1RealField = new JTextField(10);
        panel.add(num1RealField);

        plusLabel = new JLabel("+");
        panel.add(plusLabel);

        num1ImaginaryField = new JTextField(10);
        panel.add(num1ImaginaryField);

        addButton = new JButton("+");
        addButton.addActionListener(this);
        panel.add(addButton);

        num2RealField = new JTextField(10);
        panel.add(num2RealField);

        iLabel1 = new JLabel("i");
        panel.add(iLabel1);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);

        num2ImaginaryField = new JTextField(10);
        panel.add(num2ImaginaryField);

        iLabel2 = new JLabel("i");
        panel.add(iLabel2);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        panel.add(divideButton);

        equalsLabel = new JLabel("=");
        panel.add(equalsLabel);

        resultRealField = new JTextField(10);
        resultRealField.setEditable(false);
        panel.add(resultRealField);

        resultImaginaryField = new JTextField(10);
        resultImaginaryField.setEditable(false);
        panel.add(resultImaginaryField);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ComplexNumber num1 = new ComplexNumber(Double.parseDouble(num1RealField.getText()),
                Double.parseDouble(num1ImaginaryField.getText()));
        ComplexNumber num2 = new ComplexNumber(Double.parseDouble(num2RealField.getText()),
                Double.parseDouble(num2ImaginaryField.getText()));
        ComplexNumber result = null;
        String operation = "";

        if (e.getSource() == addButton) {
            result = calculator.add(num1, num2);
            operation = "add";
        }

        if (e.getSource() == multiplyButton) {
            result = calculator.multiply(num1, num2);
            operation = "multiply";
        }

        if (e.getSource() == divideButton) {
            result = calculator.divide(num1, num2);
            operation = "divide";
        }

        if (result != null) {
            resultRealField.setText(String.valueOf(result.getReal()));
            resultImaginaryField.setText(String.valueOf(result.getImaginary()));
            logger.log("Operation " + operation + " executed with operands " + num1 + " and " + num2 + ". Result: "
                    + result);
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorAdded'");
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }

}