package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */

public class TestCalc {
    
    @Test
    public void testAdd() {
        assertEquals(6, new Calc().add(3, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, new Calc().subtract(9, 3));
    }
}
    
