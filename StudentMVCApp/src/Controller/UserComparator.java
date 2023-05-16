package Controller;

import java.util.Comparator;

import Model.User;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}

