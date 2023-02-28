package PersonComparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<com.company.Person> {

    public int compare(com.company.Person a, com.company.Person b) {

        return a.compareTo(b);
    }
}