package Facade_Decorator;

public class CheesecakeMango_dec extends BakeryMenuDecorator {
    public CheesecakeMango_dec(BakeryMenu_dec newCheesecake) {
        super(newCheesecake);
    }

    public String prepareBurger () {
        return super.prepareCheesecake() + " Without Chicken patty, mayonnaise and With beef patty, onion, pickle, mustard, ketchup and Cheese.";
    }


    public double burgerPrice () {
        return super.cheesecakePrice() + 2.0;

    }
}