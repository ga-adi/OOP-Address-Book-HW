import java.util.Comparator;

/**
 * Created by charlie on 3/24/16.
 */
public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        if (o1.getDateTimeForSorting() < o2.getDateTimeForSorting()) {
            return -1;
        } else if (o1.getDateTimeForSorting() > o2.getDateTimeForSorting()) {
            return 1;
        } else {
            return 0;
        }
    }
}
