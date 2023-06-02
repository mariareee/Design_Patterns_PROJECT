package Facade_Decorator;

public class CheesecakeMango_dec extends BakeryMenuDecorator {
    public CheesecakeMango_dec(BakeryMenu_dec newCheesecake) {
        super(newCheesecake);
    }

    public String prepareCheesecake () {
        return super.prepareCheesecake() + " Without chocolate or classic filling.";
    }


    public double cheesecakePrice () {
        return super.cheesecakePrice() + 2.0;

    }
}