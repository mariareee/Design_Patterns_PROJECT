package Facade_Decorator;

public class CheesecakeClassic_dec implements BakeryMenu_dec {

    @Override
    public String prepareCheesecake() {
        return "This is McChicken";
    }

    @Override
    public double cheesecakePrice() {
        System.out.println("The price is:");
        return 18.0;
    }
}