package builder;

/* "Director" */
public class Waiter {
    private CommandBuilder commandBuilder;

    public void setCommandBuilder(CommandBuilder mb) {
        commandBuilder = mb;
    }

    public Command getCommand() {
        return commandBuilder.getCommand();
    }

    public void constructCommand() {
        commandBuilder.createNewCommand();
        commandBuilder.buildCheesecake();
        commandBuilder.buildBiscuits();
        commandBuilder.buildIceCream();
        commandBuilder.buildDrink();
        commandBuilder.buildPavlova();
    }
}
