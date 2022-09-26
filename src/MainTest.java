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

    @Test
    public void testMyQueue_1() {
        MyQueue queue1 = new MyQueue();
        String excepted = "One";
        queue1.add("One");
        queue1.add("Two");
        String actual = queue1.peek();
        assertEquals(excepted, actual);
    }

    @Test
    public void testMyQueue_2() {
        MyQueue queue1 = new MyQueue("One");
        String excepted = "Two";
        queue1.add("Two");
        queue1.poll();
        queue1.add("Three");
        String actual = queue1.peek();
        assertEquals(excepted, actual);
    }

    @Test
    public void testMyQueue_3() {
        String[] testArray = new String[]{"One", "Two"};
        MyQueue queue1 = new MyQueue(testArray);
        String excepted = "Two";
        queue1.poll();
        queue1.add("Three");
        String actual = queue1.peek();
        assertEquals(excepted, actual);
    }

    @Test
    public void testMyQueue_4() {
        String[] testArray = new String[]{"One", "Two"};
        MyQueue queue1 = new MyQueue(testArray);
        String excepted = "Two";
        queue1.remove();
        queue1.offer("Three");
        String actual = queue1.element();
        assertEquals(excepted, actual);
    }

    @Test
    public void testMyQueue_5() {
        MyQueue queue1 = new MyQueue("One");
        String excepted = null;
        queue1.remove();
        String actual = queue1.peek();
        assertEquals(excepted, actual);
    }

    @Test
    public void testMyQueue_6() {
        MyQueue queue1 = new MyQueue("One");
        String excepted = null;
        queue1.remove();
        String actual = queue1.poll();
        assertEquals(excepted, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testMyQueue_7() {
        MyQueue queue1 = new MyQueue();
        String object = null;
        queue1.add(object);

    }
}