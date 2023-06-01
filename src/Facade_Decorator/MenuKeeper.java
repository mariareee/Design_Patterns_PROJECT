package Facade_Decorator;

public class MenuKeeper {
    private MacMenu cheeseburger;
    private MacMenu hamburger;
    private MacMenu mcchicken;

    public MenuKeeper(){
        cheeseburger = new CheeseBurger();
        hamburger = new Hamburger();
        mcchicken = new McChicken();
    }
    public void cheesburgerMenu(){
        cheeseburger.action();
        cheeseburger.action1();
        cheeseburger.action2();
        cheeseburger.action3();
        cheeseburger.action4();
        cheeseburger.action5();
        cheeseburger.action6();
        cheeseburger.action7();
    }
    public void hamburgerMenu(){
        hamburger.action();
        hamburger.action1();
        hamburger.action2();
        hamburger.action3();
        hamburger.action4();
        hamburger.action5();
        hamburger.action6();
        hamburger.action7();
    }
    public void mcchickenMenu(){
        mcchicken.action();
        mcchicken.action1();
        mcchicken.action2();
        mcchicken.action3();
        mcchicken.action4();
        mcchicken.action5();
        mcchicken.action6();
        mcchicken.action7();
    }
}