package Logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {





    public static void main(String[] args) {

        Logger logger=Logger.getLogger(Main.class.getName());

        logger.info("This is level  info logging");

        logger.warning("This is level warning logging");

        logger.severe("This level server logging");



        System.out.println("Hello Java Logging APIs.");

    }

}
