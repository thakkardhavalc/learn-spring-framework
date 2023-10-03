package com.in28minutes.learnspringframework.game;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created By dhhaval thakkar on 2023-09-26
 */
public class GameRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameRunner.class);

    private final GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {

        LOGGER.info("Running Game: " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
