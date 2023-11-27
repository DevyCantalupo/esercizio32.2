import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    private final esercizio32di2 testing = new esercizio32di2();

    @Test
    void dateFull_withDate() {
        String result = testing.fechaFull(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002", result);
    }

    @Test
    void dateFull_withNull() {
        String result = testing.fechaFull(null);
        assertNull(result, "result null");
    }

    @Test
    void dateMedium_withDate() {
        String result = testing.fechaMedio(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002", result,"Data Medium ");
    }
    @Test
    void dateMedium_withNull() {
        String result = testing.fechaMedio(null);
        assertNull(result, "result null");
    }

    @Test
    void dateShort_withDate() {
        String result = testing.fechaShort(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02", result,"Data short ");
    }
    @Test
    void dateShort_withNull() {
        String result = testing.fechaShort(null);
        assertNull(result, "result null");
    }
}