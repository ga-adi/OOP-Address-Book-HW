/**
 * Created by JHADI on 3/24/16.
 */
public class PersonalContact extends Contacts implements Contacts.Text{
    public PersonalContact(String name, int number) {
        super(name, number);
    }

    @Override
    public void call() {
        System.out.println("Baby, we can work this out.");
    }

    @Override
    public void pickUpCall() {
        System.out.println("Let's go tonight");
    }

    @Override
    public void sendText() {
        System.out.println("You ready yet?");
    }
}
