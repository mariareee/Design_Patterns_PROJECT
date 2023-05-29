package FacadeAndDecoratorr;

public class McChicken_dec implements MacMenu_dec {

    @Override
    public String prepareBurger() {
        return "This is McChicken";
    }

    @Override
    public double burgerPrice() {
        System.out.println("The price is:");
        return 18.0;
    }
}