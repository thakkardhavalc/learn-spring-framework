package com.in28minutes.learnspringframework.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created By dhhaval thakkar on 2023-09-26
 */
public class MarioGame implements GamingConsole{

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioGame.class);

    public void up() {
        LOGGER.info("Jump");
    }

    public void down() {
        LOGGER.info("Go into a hole");
    }

    public void left() {
        LOGGER.info("Go Back");
    }

    public void right() {
        LOGGER.info("Accelerate");
    }
}
