import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by charlie on 3/24/16.
 */
public class AddressBookBusiness extends AddressBook {
    private LinkedList<ContactBusiness> contacts;

    /**
     * Order business contacts by how recently you spoke to each one, then
     * return the one least recently contacted, so you know who to network
     * with next (ugh, networking)
     */
    public Contact getNextPersonToCall() {
        if (contacts.isEmpty()) { return null; }

        Collections.sort(contacts, new ContactComparator());
        return contacts.get(0);
    }
}
