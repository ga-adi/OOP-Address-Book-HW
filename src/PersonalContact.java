/**
 * Created by nat on 3/23/16.
 */
public class PersonalContact extends Contact {
    private String mRelationship;

    public String getmRelationship() {
        return mRelationship;
    }

    public void setRelationship(String mRelationship) {
        this.mRelationship = mRelationship;
    }

    public void printContactInfo(){
        super.printContactInfo();
        System.out.println("Relationship:"+mRelationship);
    }
}
