package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Model.Teacher;
import Controller.UserComparator;
import Interface.iUserService;

public class TeacherService implements iUserService<Teacher> {
    
    private List<Teacher> teachers = new ArrayList<>();
    
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void update(Teacher oldTeacher, Teacher newTeacher) {
        teachers.set(teachers.indexOf(oldTeacher), newTeacher);
    }

    public List<Teacher> getAl() {
        return teachers;
    }

    public void sortByUserComparator(UserComparator<Teacher> comparator) {
        Collections.sort(teachers, comparator);
    }
}

   