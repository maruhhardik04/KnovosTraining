package Logger;


import java.io.IOException;
import java.util.logging.FileHandler;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {



    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("Main.log");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            LOGGER.warning("Failed to create log file.");
        }
    }

    public static void main(String[] args) {



        LOGGER.info("This is level  info logging");

        LOGGER.warning("This is level warning logging");

        LOGGER.severe("This level server logging");



        System.out.println("Hello Java Logging APIs.");

    }

}
