package builder;

/* "ConcreteBuilder" */
public class SimpleCommandBuilder extends CommandBuilder {
    public void buildSandwich() {
        command.setSandwich("Big Mac + Cheese Burger");
    }

    public void buildPotatoe() {
        command.setPotatoe("Corn Cup");
    }

    public void buildDessert() {
        command.setDessert("Mudpie McFLurry");
    }

    public void buildDrink() {
        command.setDrink("Double Chocolate Frappe");
    }

    public void buildSalad() {
        command.setSalad("Grilled Chicken Salad");
    }
}