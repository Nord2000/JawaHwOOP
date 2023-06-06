package StudentServiceApp.src.StudentSrvice;

import StudentServiceApp.src.StudentDomen.StudentGroup;

public class iStudentGroup implements Comparable<StudentGroup> {

    private String name;
    private int numberOfStudents;


    public void StudentGroup(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }        

    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudents;
    }

    public int compareTo(StudentGroup otherGroup) { 
        return Integer.compare((this.numberOfStudents), otherGroup.numberOfStudents);
    }

    public String toString() {
        return "Group " + name + " (" + numberOfStudents + " students)";
    }
    
}

