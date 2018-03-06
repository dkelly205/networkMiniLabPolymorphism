import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    private InternetRadio internetRadio;

    @Before
    public void setUp() throws Exception {
        internetRadio = new InternetRadio();
    }

    @Test
    public void testConnect() {
        assertEquals("connecting to CodeClan", internetRadio.connect("CodeClan"));
    }

    @Test
    public void testCanTune(){
        assertEquals("Radio 1", internetRadio.tune("Radio 1"));
    }
}


