/**
 * Created by JHADI on 3/24/16.
 */
public class BusinessContact extends Contacts {

    public BusinessContact(String name, int number) {
        super(name, number);
    }

    @Override
    public void call() {
        System.out.println("Get it done now!");
    }

    @Override
    public void pickUpCall() {
        System.out.println("It's a pleasure doing business with you.");
    }
}
