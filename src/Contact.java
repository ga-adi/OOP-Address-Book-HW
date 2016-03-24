/**
 * Created by Todo on 3/24/2016.
 */
public abstract class Contact {
    private String name;
    private String contactType;

    public abstract void setType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}
