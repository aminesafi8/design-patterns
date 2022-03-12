package tn.aminesafi.structural.proxy;

import java.io.IOException;

public interface CommandExecutor {
    void runCommand(String cmd) throws IOException;
}
