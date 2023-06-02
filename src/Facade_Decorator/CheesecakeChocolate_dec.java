package Facade_Decorator;

public class CheesecakeChocolate_dec extends BakeryMenuDecorator {

    public CheesecakeChocolate_dec(BakeryMenu_dec newCheesecake) {
        super(newCheesecake);
    }



    public String prepareCheesecake () {
        return super.prepareCheesecake() + " Without chocolate or mango syrop filling.";
    }


    public double cheesecakePrice () {
        return super.cheesecakePrice() + 2.0;

    }
}