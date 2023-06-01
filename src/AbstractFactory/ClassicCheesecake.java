//concrete participant
package AbstractFactory;
public class ClassicCheesecake implements Cheesecake{
    @Override
    public void createCheesecake() {
        System.out.println("New Classic cheesecake was created.");
    }
}