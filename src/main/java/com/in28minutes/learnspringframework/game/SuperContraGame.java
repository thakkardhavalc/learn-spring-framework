package com.in28minutes.learnspringframework.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created By dhhaval thakkar on 2023-09-26
 */
public class SuperContraGame implements GamingConsole{

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioGame.class);

    public void up() {
        LOGGER.info("up");
    }

    public void down() {
        LOGGER.info("Sit down");
    }

    public void left() {
        LOGGER.info("Go Back");
    }

    public void right() {
        LOGGER.info("Shoot a bullet");
    }
}
