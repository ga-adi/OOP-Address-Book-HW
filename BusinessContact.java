public class BusinessContact extends Contact {
  private String mName;
  private String mPhoneNumner;
  private String mAddress;
  private String mEmployer;

  @Override
  public static String getContactName(){
    return mName;
  }
  @Override
  public static void setContactName(String name){
    mName = name;
  }
  @Override
  public static String getContactNumber() {
    return mPhoneNumber;
  }
  @Override
  public static void setContactNumber(String number) {
    mPhoneNumber = number;
  }
  @Override
  public static String getContactAddress() {
    return mAddress;
  }
  @Override 
  public static void setContactAdress(String address) {
    mAddress = address;
  }
  public static String getContactEmployer() {
    return mEmployer;
  }
  public static void setContactEmployer(String employer) {
    mEmployer = employer;
  }


}
