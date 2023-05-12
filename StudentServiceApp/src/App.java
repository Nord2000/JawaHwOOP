package StudentServiceApp.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import StudentServiceApp.src.StudentDomen.Student;
import StudentServiceApp.src.StudentDomen.StudentGroup;
import StudentServiceApp.src.StudentDomen.StudentStream;
import StudentServiceApp.src.StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
    
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group 1", 20);
        StudentGroup group2 = new StudentGroup("Group 2", 15);
        StudentGroup group3 = new StudentGroup("Group 3", 10);
        
        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);

        for (StudentGroup group : stream) { 
            System.out.println(group);
        }

        Collection.sort(stream.getGroups());
        
        for (StudentGroup group : stream) { 
            System.out.println(group);
        }

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

        for(Student stud : group) {
            System.out.println((stud));
        }

        System.out.println(u1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

