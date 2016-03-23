/**
 * Created by maratmamin on 3/23/16.
 */
public abstract class AddressBook {
    private String mName;
    private String mPhone;
    private String mEmail;
    private String mUrl;

    public abstract void addContact (String name, String phoneNumber, String email, String url);

    public abstract void removeContact (String name, String phoneNumber, String email, String url);


}
