#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testValid() {
        assertEquals(solution.isValid(), false);
    }
}