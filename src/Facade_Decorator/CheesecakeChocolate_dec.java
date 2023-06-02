package Facade_Decorator;

public class CheesecakeChocolate_dec extends BakeryMenuDecorator {

    public CheesecakeChocolate_dec(BakeryMenu_dec newCheesecake) {
        super(newCheesecake);
    }



    public String prepareCheesecake () {
        return super.prepareCheesecake() + " Without Chicken patty, mayonnaise and with beef patty, onion, pickle, mustard and ketchup";
    }


    public double cheesecakePrice () {
        return super.cheesecakePrice() + 2.0;

    }
}