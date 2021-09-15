import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;


    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] testResult = {'e', 'l'};
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        // assertArrayEquals(testResult,util.everyNthChar(hello,2));
        char[] assertOutput = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 10);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, assertOutput);
    }

    @org.junit.Test
    public void removePairs() {

        assertEquals("ABCDE", util.removePairs("AABBCCDDEE"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() {

        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {

        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {

        assertNull(util.nullIfOddLength("one"));
        assertNotNull(util.nullIfOddLength("four"));

    }
}