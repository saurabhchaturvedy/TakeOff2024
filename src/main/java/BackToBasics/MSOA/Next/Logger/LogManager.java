package BackToBasics.MSOA.Next.Logger;

public class LogManager {


    public static Logger getLogger(String name) {
        return new Logger(name);

    }
}
