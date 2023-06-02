package Model;

import java.util.List;

public class AverageAge<T extends User>{
    public double calculate (List<T> users) {
        double sum = 0;
        for(T user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }
}