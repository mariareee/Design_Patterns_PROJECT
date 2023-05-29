package AbstractFactory;

public class MangoCheesecake implements Cheesecake {
    @Override
    public void createCheesecake() {
        System.out.println("New Mango Cheesecake was created.");
    }
}