import java.util.Comparator;

/**
 * Created by charlie on 3/24/16.
 */
public abstract class Contact {
    private String firstName, lastName, phoneNumber, emailAddress;
    private long dateTimeForSorting;

    /**
     * Different subclasses will use different types of date/times for sorting
     */
    public abstract long getDateTimeForSorting();

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
