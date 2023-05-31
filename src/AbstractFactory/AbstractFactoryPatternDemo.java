package AbstractFactory;
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory cheesecakeFactory = FactoryProducer.getFactory("Cheesecake");

        Cheesecake cheesecake1 = cheesecakeFactory.getCheesecake("Mango Cheesecake");
        cheesecake1.createCheesecake();

        Cheesecake cheesecake2 = cheesecakeFactory.getCheesecake("Chocolate Cheesecake");
        cheesecake2.createCheesecake();

        Cheesecake cheesecake3 = cheesecakeFactory.getCheesecake("Classic Cheesecake");
        cheesecake3.createCheesecake();
    }
}
