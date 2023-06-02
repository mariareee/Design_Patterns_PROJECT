package Facade_Decorator;

public class CheesecakeMango implements BakeryMenu {
    @Override
    public void action() {
        System.out.println("Taking a regular bun...");
    }

    @Override
    public void action1() {
        System.out.println("Putting the 100% Beef Patty...");

    }

    @Override
    public void action2() {
        System.out.println("Adding the pasteurized process American Cheese... ");

    }

    @Override
    public void action3() {
        System.out.println("Taking a pickle, cutting it and putting the pickle slices...  ");
    }

    @Override
    public void action4() {
        System.out.println("Taking  an onion, cutting it down and putting over pikles slice...");
    }

    @Override
    public void action5() {
        System.out.println("Anointing with mustard...");
    }

    @Override
    public void action6() {
        System.out.println("Anointing with ketchup...");
    }

    @Override
    public void action7() {
        System.out.println("Covering all this with regular bun.");
    }



}
