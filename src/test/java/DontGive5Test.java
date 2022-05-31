import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DontGive5Test {
    @Test
    public void exampleTests() {
        assertEquals(8, DontGive5.dontGiveMeFive(1,9));
        assertEquals(12, DontGive5.dontGiveMeFive(4,17));
        assertEquals(1, DontGive5.dontGiveMeFive(149,156));
        assertEquals(9, DontGive5.dontGiveMeFive(-5,4));
    }

}