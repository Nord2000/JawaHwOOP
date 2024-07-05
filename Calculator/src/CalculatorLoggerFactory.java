import Calculator.Interface.ILogger;
import Calculator.Interface.ILoggerFactory;

public class CalculatorLoggerFactory implements ILoggerFactory {
    public ILogger getLogger() {
        return new ConsoleLogger();
    }
}