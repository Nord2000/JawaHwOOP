package Model;

import java.util.List;

import Controller.UserComparator;
import Interface.iUserController;

public class TeacherController implements iUserController<Teacher> {
    
    private TeacherService teacherService = new TeacherService();

    
    public void add(Teacher teacher) {
        teacherService.add(teacher);
    }

    public void delete(Teacher teacher) { 
        teacherService.delete(teacher);
    }
    
    public void update(Teacher oldTeacher, Teacher newTeacher) {

        teacherService.update(oldTeacher, newTeacher);        
    }

    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    public void sortByUserComparator(UserComparator<Teacher> comparator) {
        teacherService.sortByUserComparator(comparator);
    }
}
