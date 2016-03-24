/**
 * Created by Todo on 3/24/2016.
 */
public class BusinessContact extends Contact {

    private String occupation;

    @Override
    public void setType() {
        setContactType("Business Contact");
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
