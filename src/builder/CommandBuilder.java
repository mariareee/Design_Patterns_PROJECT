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
    public abstract void buildSandwich();
    public abstract void buildPotatoe();
    public abstract void buildDessert();
    public abstract void buildDrink();
    public abstract void buildSalad();

}
