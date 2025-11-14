package fr.damnardev.boilerplate.maven.cli;

import fr.damnardev.boilerplate.maven.common.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Startup {

    private static final Logger LOGGER = LoggerFactory.getLogger(Startup.class);

        public static void main(String[] args) {
        LOGGER.info("10 + 10 = {}", Calculator.add(10, 10));
    }

}
