package FacadeAndDecoratorr;

public class MacMenuDecorator implements MacMenu_dec{
    private MacMenu_dec newBurger;
    public MacMenuDecorator(MacMenu_dec newBurger)  {
        this.newBurger=newBurger;
    }


    @Override
    public String prepareBurger() {
        return  ("Consistence: " + newBurger.prepareBurger());
    }

    @Override
    public double burgerPrice() {
        return newBurger.burgerPrice();
    }
}
