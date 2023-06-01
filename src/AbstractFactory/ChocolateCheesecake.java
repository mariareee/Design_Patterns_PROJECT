//concrete participant
package AbstractFactory;
public class ChocolateCheesecake implements Cheesecake {
    @Override
    public void createCheesecake() {
        System.out.println("New Chocolate Cheesecake was created.");
    }
}