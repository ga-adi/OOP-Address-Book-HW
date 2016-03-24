/**
 * Created by nat on 3/23/16.
 */
public class BusinessAddressBook extends AddressBook {
    @Override
    public Contact createContact(String firstName, String lastName, String phoneNumber, String company) {
        BusinessContact businessContact = new BusinessContact();
        businessContact.setFirstName(firstName);
        businessContact.setLastName(lastName);
        businessContact.setmPhoneNumber(phoneNumber);
        businessContact.setCompanyName(company);
        return businessContact;
    }

    @Override
    public void addContact(Contact c) {
        //since its business, check everything is filled in first
        if(c instanceof BusinessContact){
            String companyName=((BusinessContact)c).getmCompanyName();
            if(companyName!=null){
                mContacts.add(c);
            }else{
                System.out.println("cannot add contact without a company name");
            }

        }
    }

    @Override
    public void printAddressBook() {
        for(int i=0;i<mContacts.size();i++) {
            BusinessContact businessContact = (BusinessContact)mContacts.get(i);
            System.out.println("-------------------------------");
            System.out.println("Business Entry: " +businessContact.getmCompanyName());
            businessContact.printContactInfo();
        }//end of for loop
    }
}

