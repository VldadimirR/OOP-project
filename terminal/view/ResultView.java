package terminal.view;

import terminal.executable.executables.CommandResult;

public interface ResultView {
    void processCommandResult(CommandResult commandResult);
}
