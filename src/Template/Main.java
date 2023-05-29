package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;
    private static int choice1;
    private static int choice2;

    public static void main(String args[]) throws NumberFormatException, IOException {

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

}
