package Model;

import java.util.List;

import Interface.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }
}