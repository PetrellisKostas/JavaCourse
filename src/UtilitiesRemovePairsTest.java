import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class UtilitiesRemovePairsTest {

    private String input;
    private String output;
    private Utilities util;


    public UtilitiesRemovePairsTest(String input, String output) {
        this.input = input;
        this.output = output;
    }
    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }
    @Parameterized.Parameters
    public static Collection<Object []> testSources(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG","AB8EFG"},
                {"112233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}
        });
    }

    @org.junit.Test
    public void removePairsTest(){
        assertEquals(output,util.removePairs(input));
    }
}
