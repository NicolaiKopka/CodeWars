import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AreSameTest {


    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[0];
        int[] b = new int[0];
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void test3() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(true, AreSame.comp(a, b));
    }


}