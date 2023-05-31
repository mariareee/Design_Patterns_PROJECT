package builder;
/* "ConcreteBuilder" */
public class SweetBrunchCommandBuilder extends CommandBuilder {

    public void buildCheesecake() {
        command.setCheesecake("Classic Cheesecake");
    }
    public void buildBiscuits() {
        command.setBiscuits("Cookies");
    }
    public void buildIceCream() {
        command.setIceCream("Vanilla + Strawberry");
    }
    public void buildDrink() {
        command.setDrink("Cappuccino");
    }
    public void buildPavlova() {
        command.setPavlova("Vegan Pavlova");
    }

}
