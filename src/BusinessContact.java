/**
 * Created by nat on 3/23/16.
 */
public class BusinessContact extends Contact{
    String mCompanyName=null;

    public String getmCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String mCompanyName) {
        this.mCompanyName = mCompanyName;
    }

    public void printContactInfo(){
        System.out.println("Company:"+mCompanyName);
        super.printContactInfo();

    }

}
