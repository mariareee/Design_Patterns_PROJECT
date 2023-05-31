package prototype;
import java.util.HashMap;

public class CommandRegistry {
    private HashMap<Command.CommandType,Command> commands = new HashMap<>();

    public void addCommand(Command.CommandType type, Command command){
        commands.put(type, command);
    }
    public void removeCommandByType(Command.CommandType type, Command command){
        commands.remove(type, command);
    }
    public Command getCommandByType(Enum commandType){
        if(commands.containsKey(commandType)){
            return commands.get(commandType);
        }
        return null;
    }
}
