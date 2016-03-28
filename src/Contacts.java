/**
 * Created by JHADI on 3/24/16.
 */
public abstract class Contacts {
    int mCellPhoneNumber;
    String mName;

    public Contacts(String name, int number){
        mCellPhoneNumber = number;
        mName = name;
    }

    public interface Text{
        public void sendText();
    };
    public abstract void call();
    public abstract void pickUpCall();

    public int getmCellPhoneNumber() {
        return mCellPhoneNumber;
    }

    public void setmCellPhoneNumber(int mCellPhoneNumber) {
        this.mCellPhoneNumber = mCellPhoneNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }


}
