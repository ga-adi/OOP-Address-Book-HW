import java.util.List;

/**
 * Created by charlie on 3/24/16.
 */
public class AddressBook {
    private List<Contact> contacts;

    public boolean addContact(Contact contact) {
        return contacts.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }
}
