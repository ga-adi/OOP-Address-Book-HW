public class PersonalContact extends Contact {
  private String mName;
  private String mPhoneNumner;
  private String mAddress;
  private boolean mIsFavorite;

  public static String getContactName(){
    return mName;
  }
  public static void setContactName(String name){
    mName = name;
  }
  public static String getContactNumber() {
    return mPhoneNumber;
  }
  public static void setContactNumber(String number) {
    mPhoneNumber = number;
  }
  public static String getContactAddress() {
    return mAddress;
  }
  public static void setContactAdress(String address) {
    mAddress = address;
  }
  public static String getIsFavorite(){
    return mIsFavorite;
  }
  public static void setIsFavorite(boolean trueOrFalse) {
    mIsFavorite = trueOrFalse;
  }

}
