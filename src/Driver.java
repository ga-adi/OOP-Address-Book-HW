/**
 * Created by nat on 3/24/16.
 */
public class Driver {


    public static void main(String args[]){
        System.out.println("Starting program...");
        System.out.println("Creating personal address book and adding contacts");
        PersonalAddressBook personalAddressBook = new PersonalAddressBook();
        Contact c = personalAddressBook.createContact("bobPersonal","smithPersonal","444-444-4444","neighbor");
        personalAddressBook.addContact(c);
        c = personalAddressBook.createContact("samPersonal","shepartdPersonal","555-555-5555","friend");
        personalAddressBook.addContact(c);
        personalAddressBook.printAddressBook();

        BusinessAddressBook businessAddressBook = new BusinessAddressBook();
        c = businessAddressBook.createContact("henyBusiness","henryLastNameBusiness","22222222","Acme Co");
        businessAddressBook.addContact(c);
        businessAddressBook.printAddressBook();


    }
}
