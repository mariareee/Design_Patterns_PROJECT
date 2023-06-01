package Facade_Decorator;

public class Hamburger_dec extends MacMenuDecorator{

    public Hamburger_dec(MacMenu_dec newBurger) {
        super(newBurger);
    }



    public String prepareBurger () {
        return super.prepareBurger() + " Without Chicken patty, mayonnaise and with beef patty, onion, pickle, mustard and ketchup";
    }


    public double burgerPrice () {
        return super.burgerPrice() + 2.0;

    }
}