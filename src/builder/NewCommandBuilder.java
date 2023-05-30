package builder;

/* A customer command. */
public class NewCommandBuilder {
    public static void main(String[] args) {
        Command command;
        Waiter waiter = new Waiter();
        CommandBuilder sweetBrunchCommandBuilder = new SweetBrunchCommandBuilder();
        CommandBuilder simpleCommandBuilder = new SimpleCommandBuilder();

        waiter.setCommandBuilder(sweetBrunchCommandBuilder);
        waiter.constructCommand();

        command = waiter.getCommand();
        System.out.println("Your command is:   "+ command);

        waiter.setCommandBuilder(simpleCommandBuilder);
        waiter.constructCommand();

        command = waiter.getCommand();

        System.out.println();
        System.out.println("Your command is:   "+ command);
    }
}