package com.in28minutes.learnspringframework.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created By dhhaval thakkar on 2023-09-26
 */
public class PacmanGame implements GamingConsole{

    private static final Logger LOGGER = LoggerFactory.getLogger(MarioGame.class);

    @Override
    public void up() {
        LOGGER.info("up");
    }

    @Override
    public void down() {
        LOGGER.info("down");
    }

    @Override
    public void left() {
        LOGGER.info("left");
    }

    @Override
    public void right() {
        LOGGER.info("right");
    }
}
