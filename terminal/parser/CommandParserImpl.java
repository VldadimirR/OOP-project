package terminal.parser;

import java.util.List;
import static java.util.Arrays.asList;
import terminal.Command;

public class CommandParserImpl implements CommandParser {

    public Command parseCommand(String inputCommand) {
        List<String> list = asList(inputCommand.split("\\s+"));
        return new Command(list);
    }
}