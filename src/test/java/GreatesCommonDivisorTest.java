import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatesCommonDivisorTest {
    @Test
    public void testGcd() {
        assertEquals(6, GreatesCommonDivisor.compute(30,12));
        assertEquals(1, GreatesCommonDivisor.compute(8,9));
        assertEquals(1, GreatesCommonDivisor.compute(1,1));
    }
}