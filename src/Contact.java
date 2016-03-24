/**
 * Created by nat on 3/23/16.
 */
public class Contact {
    private String mPhoneNumber;
    private String firstName;
    private String lastName;

    public Contact(){

    }
    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printContactInfo(){
        System.out.println("FirstName: "+firstName);
        System.out.println("LastName: "+lastName);
        System.out.println("PhoneNo.:"+mPhoneNumber);
    }
}
