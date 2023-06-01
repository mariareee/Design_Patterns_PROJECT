package Facade_Decorator;

public class CheeseBurger_dec extends MacMenuDecorator {
    public CheeseBurger_dec(MacMenu_dec newBurger) {
        super(newBurger);
    }

    public String prepareBurger () {
        return super.prepareBurger() + " Without Chicken patty, mayonnaise and With beef patty, onion, pickle, mustard, ketchup and Cheese.";
    }


    public double burgerPrice () {
        return super.burgerPrice() + 2.0;

    }
}