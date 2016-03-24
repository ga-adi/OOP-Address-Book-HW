import java.util.ArrayList;

/**
 * Created by Todo on 3/24/2016.
 */
public class AddressBook {
    public ArrayList<Contact> mContacts;

    public void addContact(Contact contact){
        mContacts.add(contact);
    }

    public void removeContact(Contact contact){
        mContacts.remove(contact);
    }
}
