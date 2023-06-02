package Facade_Decorator;

public class BakeryMenuDecorator implements BakeryMenu_dec {
    private BakeryMenu_dec newCheesecake;
    public BakeryMenuDecorator(BakeryMenu_dec newCheesecake)  {
        this.newCheesecake=newCheesecake;
    }


    @Override
    public String prepareCheesecake() {
        return  ("Consistence: " + newCheesecake.prepareCheesecake());
    }

    @Override
    public double cheesecakePrice() {
        return newCheesecake.cheesecakePrice();
    }
}