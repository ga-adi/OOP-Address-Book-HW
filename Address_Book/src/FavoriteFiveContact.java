/**
 * Created by maratmamin on 3/23/16.
 */
public class FavoriteFiveContact extends AddressBook {
    private String mName;
    private String mPhone;
    private String mEmail;
    private String mUrl;
    private String mRelation;

    @Override
    public void addContact(String name, String phoneNumber, String email, String url, String relation) {
        mName = name;
        mPhone = phoneNumber;
        mEmail = email;
        mUrl = url;
        mRelation = relation;
    }

    @Override
    public void removeContact(String name, String phoneNumber, String email, String url) {

    }
}
