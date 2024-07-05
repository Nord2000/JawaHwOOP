import Calculator.Interface.ILogger;

public class ConsoleLogger implements ILogger {
    public void log(String message) {
        System.out.println(message);
    }
}
