package BackToBasics.MSOA.Next.Logger;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {


    String name;
    LogLevel level;

    List<Appender> appenders;


    Logger(String name) {

        this.name = name;
        this.level = LogLevel.INFO;
        this.appenders = new ArrayList<>();
    }


    public void addAppender(Appender appender) {

        this.appenders.add(appender);
    }


    public void setLevel(LogLevel level) {

        this.level = level;
    }


    public void log(LogLevel level, String message) {

        if (this.level.ordinal() <= level.ordinal()) {

            Date timestamp = new Date();

            for (Appender appender : appenders) {

                String msg = new SimpleLayout().format(timestamp, level, message);
                appender.append(message);
            }
        }
    }


    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }



}
