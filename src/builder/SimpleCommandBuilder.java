package builder;

/* "ConcreteBuilder" */
public class SimpleCommandBuilder extends CommandBuilder {
    public void buildCheesecake() {
        command.setCheesecake("Classic Cheesecake + Chocolate Cheesecake");
    }

    public void buildBiscuits() {
        command.setBiscuits("Butter biscuits");
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