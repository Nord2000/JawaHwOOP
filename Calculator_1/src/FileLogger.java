package Calculator_1.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import Calculator_1.Interface.CalculatorLogger;

public class FileLogger implements CalculatorLogger {
  private String fileName;

  public FileLogger(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void log(String message) {
    try {
      Files.write(Paths.get(fileName), message.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
