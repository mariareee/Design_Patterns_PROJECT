package FacadeAndDecoratorr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= McDonald's Menu============ \n");
            System.out.print("            1. McChicken.              \n");
            System.out.print("            2. Hamburger.             \n");
            System.out.print("            3. Cheeseburger            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            MenuKeeper sk = new MenuKeeper();

            switch (choice) {
                case 1: {
                    sk.mcchickenMenu();
                    McChicken_dec mc = new McChicken_dec();
                    System.out.println(mc.prepareBurger());
                    System.out.println(mc.burgerPrice());
                }
                break;
                case 2: {
                    sk.hamburgerMenu();
                    MacMenu_dec hb = new Hamburger_dec((MacMenu_dec) new McChicken_dec());
                    System.out.println(hb.prepareBurger());
                    System.out.println(hb.burgerPrice());
                }
                break;
                case 3: {
                    sk.cheesburgerMenu();
                    MacMenu_dec cb = new CheeseBurger_dec((MacMenu_dec) new McChicken_dec());
                    System.out.println(cb.prepareBurger());
                    System.out.println(cb.burgerPrice());
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