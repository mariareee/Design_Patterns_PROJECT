package Facade_Decorator;

public class MenuKeeper {
    private BakeryMenu cheesecakeClassic;
    private BakeryMenu cheesecakeChocolate;
    private BakeryMenu cheesecakeMango;

    public MenuKeeper(){
        cheesecakeClassic = new CheesecakeClassic();
        cheesecakeChocolate = new CheesecakeChocolate();
        cheesecakeMango = new CheesecakeMango();
    }
    public void cheesecakeClassicMenu(){
        cheesecakeClassic.action();
        cheesecakeClassic.action1();
        cheesecakeClassic.action2();
        cheesecakeClassic.action3();
        cheesecakeClassic.action4();
        cheesecakeClassic.action5();
        cheesecakeClassic.action6();
        cheesecakeClassic.action7();
    }
    public void cheesecakeChocolateMenu(){
        cheesecakeChocolate.action();
        cheesecakeChocolate.action1();
        cheesecakeChocolate.action2();
        cheesecakeChocolate.action3();
        cheesecakeChocolate.action4();
        cheesecakeChocolate.action5();
        cheesecakeChocolate.action6();
        cheesecakeChocolate.action7();
    }
    public void cheesecakeMangoMenu(){
        cheesecakeMango.action();
        cheesecakeMango.action1();
        cheesecakeMango.action2();
        cheesecakeMango.action3();
        cheesecakeMango.action4();
        cheesecakeMango.action5();
        cheesecakeMango.action6();
        cheesecakeMango.action7();
    }
}