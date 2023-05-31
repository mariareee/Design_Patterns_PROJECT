import AbstractFactory.AbstractFactory;
import builder.*;
import FacadeAndDecoratorr.*;
import prototype.*;
import  Template.*;
import AbstractFactory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;
    private static int choice1;
    private static int choice2;

    private static void abstractFactory(){
        AbstractFactory cheesecakeFactory = FactoryProducer.getFactory("CheeseCake");

        Cheesecake cheesecake1 = cheesecakeFactory.getCheesecake("Mango Cheesecake");
        cheesecake1.createCheesecake();

        Cheesecake cheesecake2 = cheesecakeFactory.getCheesecake("Chocolate Cheesecake");
        cheesecake2.createCheesecake();

        Cheesecake cheesecake3 = cheesecakeFactory.getCheesecake("Classic Cheesecake");
        cheesecake3.createCheesecake();
    }

    private static void builder() {
        builder.Command command;
        Waiter waiter = new Waiter();
        CommandBuilder businessLunchbuilder = new SweetBrunchCommandBuilder();
        CommandBuilder simpleCommandBuilder = new SimpleCommandBuilder();

        waiter.setCommandBuilder(businessLunchbuilder);
        waiter.constructCommand();

        command = waiter.getCommand();
        System.out.println("Your command is:   "+ command);

        waiter.setCommandBuilder(simpleCommandBuilder);
        waiter.constructCommand();

        command = waiter.getCommand();

        System.out.println();
        System.out.println("Your command is:   "+ command);
    }

    private static void facade() throws IOException {
        do{
            System.out.print("========= McDonald's Menu============ \n");
            System.out.print("            1. McChicken.              \n");
            System.out.print("            2. Hamburger.             \n");
            System.out.print("            3. Cheeseburger            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            MenuKeeper sk=new MenuKeeper();

            switch (choice) {
                case 1:
                {
                    sk.mcchickenMenu();
                    McChicken_dec mc = new McChicken_dec();
                    System.out.println(mc.prepareBurger());
                    System.out.println(mc.burgerPrice());
                }
                break;
                case 2:
                {
                    sk.hamburgerMenu();
                    MacMenu_dec hb = new Hamburger_dec((MacMenu_dec) new McChicken_dec());
                    System.out.println(hb.prepareBurger());
                    System.out.println(hb.burgerPrice());
                }
                break;
                case 3:
                {
                    sk.cheesburgerMenu();
                    MacMenu_dec cb = new CheeseBurger_dec((MacMenu_dec) new McChicken_dec());
                    System.out.println(cb.prepareBurger());
                    System.out.println(cb.burgerPrice());
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
    }

    private static void prototype(){
        CommandRegistry commandRegistry = new CommandRegistry();
        prototype.Command command1 = new prototype.Command();

        Product shrimpMcWrap = new BirthdayPancake();
        Product dorna = new FijiWater();
        Product mcToast = new SweetSet();

        command1.addProduct(shrimpMcWrap);
        command1.addProduct(dorna);
        command1.addProduct(mcToast);
        command1.setType(prototype.Command.CommandType.Heavy);

        commandRegistry.addCommand(command1.getType(), command1);

        prototype.Command command2 = commandRegistry.getCommandByType(prototype.Command.CommandType.Heavy).clone();

        System.out.println(command1);
        System.out.println(command2);
    }

    private static void template() throws IOException {
        System.out.print("=========Choose McDonald's Menu Template============ \n");
        System.out.print("            1. Line Template.              \n");
        System.out.print("            2. Grid Template.             \n");
        System.out.print("            3. Exit.             \n");
        System.out.print("Enter your choice: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());



        switch (choice) {
            case 1: {
                MenuTemplate line = new LineMenuTemplate();
                line.chooseMenuTemplate(true, false);
                System.out.println();
                System.out.print("========= Oreder Type ============ \n");
                System.out.print("            1. Home.              \n");
                System.out.print("            2. Local.             \n");
                System.out.print("            3. Exit.                     \n");
                System.out.print("Enter your choice: ");
                choice1 = Integer.parseInt(br.readLine());

                switch (choice1) {
                    case 1: {
                        OrderProcessTemplate netOrder = new NetOrder();
                        netOrder.processOrder(true);
                        System.out.println();
                    }
                    break;
                    case 2: {
                        OrderProcessTemplate localOrder = new LocalOrder();
                        localOrder.processOrder(true);
                        System.out.println();
                    }
                    break;
                    default: {
                        System.out.println("Upss...Try again!");
                    }
                    return;
                }
            }
            break;
            case 2: {
                MenuTemplate grid = new GridMenuTemplate();
                grid.chooseMenuTemplate(false, true);
                System.out.println();
                System.out.print("========= Oreder Type ============ \n");
                System.out.print("            1. Home.              \n");
                System.out.print("            2. Local.             \n");
                System.out.print("            3. Exit.                     \n");
                System.out.print("Enter your choice: ");
                choice2 = Integer.parseInt(br.readLine());
                switch (choice2) {
                    case 1: {
                        OrderProcessTemplate netOrder = new NetOrder();
                        netOrder.processOrder(true);
                        System.out.println();
                    }
                    break;
                    case 2: {
                        OrderProcessTemplate localOrder = new LocalOrder();
                        localOrder.processOrder(true);
                        System.out.println();
                    }
                    break;
                    default: {
                        System.out.println("Upss...Try again!");
                    }
                    return;
                }

            }
            break;
            default: {
                System.out.println("Upss...Try again!");
            }
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        Main.prototype();
        Main.template();
        Main.facade();
        Main.builder();
        Main.abstractFactory();
    }
}