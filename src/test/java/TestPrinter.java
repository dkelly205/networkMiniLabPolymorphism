import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    private Printer printer;

    @Before
    public void setUp() throws Exception {
        printer = new Printer();
    }

    @Test
    public void testCanPrint() {
        assertEquals("printing: helloworld", printer.print("helloworld"));
    }

    @Test
    public void testConnect() {
        assertEquals("connecting to network: CodeClan", printer.connect("CodeClan"));
    }
}
