package Interface;

import java.util.List;
import Model.Student;

public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}