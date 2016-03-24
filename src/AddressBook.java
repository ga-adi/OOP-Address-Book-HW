import java.util.ArrayList;

/**
 * Created by nat on 3/23/16.
 */
public abstract class AddressBook {
    protected ArrayList<Contact> mContacts;

    public AddressBook(){
        mContacts = new ArrayList<>();
    }
    public  abstract Contact createContact(String firstName,String lastName,String phoneNumber,String extra);
    protected abstract void addContact(Contact c);
    public abstract void printAddressBook();

}
