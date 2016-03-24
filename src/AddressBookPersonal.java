import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

/**
 * Created by charlie on 3/24/16.
 */
public class AddressBookPersonal extends AddressBook {
    private LinkedList<ContactPersonal> contacts;

    public Contact getPersonWithNextBirthday() {
        if (contacts.isEmpty()) { return null; }

        Date today = new Date();

        // sort by birthday
        Collections.sort(contacts, new ContactComparator());

        for (ContactPersonal contact : contacts) {
            // return the first contact w/ a birthday this year later than today
            if (contact.getDateOfBirth() > today.getTime()) {
                return contact;
            }
        }

        // if no personal contacts have birthday later this year, get first one next year
        return contacts.get(0);
    }
}
