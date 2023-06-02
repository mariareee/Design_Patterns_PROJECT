package Facade_Decorator;

public class CheesecakeChocolate  implements BakeryMenu {
    @Override
    public void action() {
        System.out.println("Taking a regular bun...");
    }

    @Override
    public void action1() {
        System.out.println("Taking a pan...");

    }
    @Override
    public void action2() {
        System.out.println("Crushing biscuits and pressing them into the bottom of a pan....");

    }

    @Override
    public void action3() {
        System.out.println("Beating cream cheese until smooth and creamy...");
    }

    @Override
    public void action4() {
        System.out.println("Adding chocolate bites to the filling");
    }

    @Override
    public void action5() {
        System.out.println("Pouring the cream cheese mixture over the crust in the pan.... ");
    }

    @Override
    public void action6() {
        System.out.println("Letting the cheesecake to cool...");
    }

    @Override
    public void action7() {
        System.out.println("Serving the cheesecake.");
    }
}