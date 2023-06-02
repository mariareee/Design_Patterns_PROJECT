package Facade_Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= McDonald's Menu================= \n");
            System.out.print("            1. Classic cheesecake.         \n");
            System.out.print("            2. Chocolate cheesecake.       \n");
            System.out.print("            3. Mango cheesecake            \n");
            System.out.print("            4. Exit.                       \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
              MenuKeeper sk = new MenuKeeper();

            switch (choice) {
                case 1: {
                    sk.cheesecakeClassicMenu();
                    CheesecakeClassic_dec mc = new CheesecakeClassic_dec();
                    System.out.println(mc.prepareCheesecake());
                    System.out.println(mc.cheesecakePrice());
                }
                break;
                case 2: {
                    sk.cheesecakeChocolateMenu();
                    BakeryMenu_dec hb = new CheesecakeChocolate_dec((BakeryMenu_dec) new CheesecakeClassic_dec());
                    System.out.println(hb.prepareCheesecake());
                    System.out.println(hb.cheesecakePrice());
                }
                break;
                case 3: {
                    sk.cheesecakeMangoMenu();
                    BakeryMenu_dec cb = new CheesecakeMango_dec((BakeryMenu_dec) new CheesecakeClassic_dec());
                    System.out.println(cb.prepareCheesecake());
                    System.out.println(cb.cheesecakePrice());
                }
                break;
                default: {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        } while (choice != 4);
    }
}