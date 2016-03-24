/**
 * Created by Todo on 3/24/2016.
 */
public class PersonalContact extends Contact {

    private String personalConnection;

    @Override
    public void setType() {
        setContactType("Personal Contact");
    }

    public String getPersonalConnection() {
        return personalConnection;
    }

    public void setPersonalConnection(String personalConnection) {
        this.personalConnection = personalConnection;
    }
}
