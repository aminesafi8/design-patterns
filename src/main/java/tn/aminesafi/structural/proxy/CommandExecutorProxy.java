package tn.aminesafi.structural.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private final CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("amine".equals(user) && "a$m#inE".equals(pwd)) isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws IOException {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new IllegalArgumentException("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}
