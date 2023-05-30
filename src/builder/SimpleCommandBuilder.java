package builder;

/* "ConcreteBuilder" */
public class SimpleCommandBuilder extends CommandBuilder {
    public void buildCheesecake() {
        command.setCheesecake("Big Mac + Cheese Burger");
    }

    public void buildBiscuits() {
        command.setBiscuits("Corn Cup");
    }

    public void buildIceCream() {
        command.setIceCream("Peppermint Candy");
    }

    public void buildDrink() {
        command.setDrink("Caramel Cappuccino");
    }

    public void buildPavlova() {
        command.setPavlova("Gluten-free Pavlova");
    }
}