import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest extends Main {

    @Test
    public void testCheckString() {
        assertTrue(checkString("asdf"));
    }

    @Test
    public void testCheckString1() {
        assertFalse(checkString("asdf34523"));
    }

    @Test
    public void testCheckString2() {
        assertFalse(checkString("hgiwhaegq38tygh3"));
    }

    @Test
    public void testCheckString3() {
        assertTrue(checkString(" asdf"));
    }

    @Test
    public void testCheckString4() {
        assertTrue(checkString(""));
    }
}