package builder;

/* "ConcreteBuilder" */
public class BussinessLunchCommandBuilder extends CommandBuilder {
    //implements SaladBuilder, SandwichBuilder, DrinkBuilder, DessertBuilder, PotatoeBuilder {
    public void buildSandwich() {
        command.setSandwich("Chicken Burger");
    }
    public void buildPotatoe() {
        command.setPotatoe("Dippers");
    }
    public void buildDessert() {
        command.setDessert("MCSundae + Shake");
    }
    public void buildDrink() {
        command.setDrink("Cappuccino");
    }
    public void buildSalad() {
        command.setSalad("Greek Salad");
    }

}
