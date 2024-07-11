package BackToBasics.MSOA.Next.Logger;

public class Main {


    public static void main(String[] args) {


        Logger logger = LogManager.getLogger("Test-Logger");

        logger.setLevel(LogLevel.INFO);
        ConsoleAppender consoleAppender = new ConsoleAppender(new SimpleLayout());
        FileAppender fileAppender = new FileAppender(new SimpleLayout(), "app.log");


        logger.addAppender(consoleAppender);
        logger.addAppender(fileAppender);


        logger.log(LogLevel.INFO, "This is info message");
        logger.log(LogLevel.DEBUG, "This is debug message");
        logger.log(LogLevel.WARN, "This is warn message");
    }
}
