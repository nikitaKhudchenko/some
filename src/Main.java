import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().
                format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
    }
}
