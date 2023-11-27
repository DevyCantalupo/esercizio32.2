import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class esercizio32di2 {
    public static void main(String[] args) {

        OffsetDateTime fecha = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(fecha);

        System.out.println(fechaShort(fecha));
        System.out.println(fechaMedio(fecha));
        System.out.println(fechaFull(fecha));
    }

    public static String fechaFull(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        }
    }

    public static String fechaMedio(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        }
    }

    public static String fechaShort(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        }
    }
}
