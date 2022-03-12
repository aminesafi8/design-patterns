package tn.aminesafi.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("amine", "wrong_pwd");
        try {
            executor.runCommand("cmd /c dir"); // windows command
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            log.error("Exception Message:: [{}]", e.getMessage());
        }

    }

}