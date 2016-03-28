/**
 * Created by JHADI on 3/24/16.
 */
public class FamilyContact extends Contacts {

    public FamilyContact(String name, int number) {
        super(name, number);
    }

    @Override
    public void call() {
        System.out.println("For better or worse, we're stuck together");
    }

    @Override
    public void pickUpCall() {
        System.out.println("Yes mom, I understand.");
    }
}
