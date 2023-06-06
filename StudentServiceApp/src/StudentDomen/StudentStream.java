package StudentServiceApp.src.StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    private int streamNumber;
    private List<StudentGroup>groups;


    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public List<StudentGroup> getGroups() {

        return groups;
    }

    public Iterator<StudentGroup>iterator() {
        return groups.iterator();
    }
}


    
