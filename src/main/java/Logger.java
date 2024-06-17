import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Logger {
    private static Logger instance;
    protected int num = 1;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        String format = time.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println("[" + format + " " + num++ + "] " + msg);
    }
}
