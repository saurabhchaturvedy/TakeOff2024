package BackToBasics.MSOA.Next.Logger;

import java.sql.Timestamp;
import java.util.Date;

public interface Layout {


    String format(Date timestamp, LogLevel level, String message);
}
