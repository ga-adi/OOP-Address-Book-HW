/**
 * Created by nat on 3/23/16.
 */
public class PersonalAddressBook extends AddressBook {



    @Override
    public void addContact(Contact c) {
        //add it directly to list
        mContacts.add(c);
    }

    @Override
    public Contact createContact(String firstName,String lastName,String phoneNumber,String relationship){
        PersonalContact personalContact = new PersonalContact();
        personalContact.setFirstName(firstName);
        personalContact.setLastName(lastName);
        personalContact.setmPhoneNumber(phoneNumber);
        personalContact.setRelationship(relationship);
        return personalContact;

    }
    @Override
    public void printAddressBook() {
        System.out.println("Personl Address Book");
        for(int i=0;i<mContacts.size();i++){
            System.out.println("-------------------------------");
            PersonalContact p = (PersonalContact)mContacts.get(i);
            p.printContactInfo();

        }
    }
}
