package builder;

/* "Abstract Builder" */
public abstract class CommandBuilder {
    protected Command command;

    public Command getCommand() {
        return command;
    }
    public void createNewCommand() {
        command = new Command();
    }
    public abstract void buildCheesecake();
    public abstract void buildBiscuits();
    public abstract void buildIceCream();
    public abstract void buildDrink();
    public abstract void buildPavlova();

}
