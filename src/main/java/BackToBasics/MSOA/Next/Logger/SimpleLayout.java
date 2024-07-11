package BackToBasics.MSOA.Next.Logger;

import java.sql.Timestamp;
import java.util.Date;

public class SimpleLayout implements Layout {
    @Override
    public String format(Date timestamp, LogLevel level, String message) {
        return String.format("[%s] [%s] %s", timestamp.toString(), level, message);
    }
}
