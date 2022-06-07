import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class AreSame {

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        comp(a, b);
    }

    public static boolean comp(int[] a, int[] b) {
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a == null || b == null) {
            return false;
        }
        int[] resultArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultArray[i] = (a[i] * a[i]);
        }
        Arrays.sort(resultArray);
        Arrays.sort(b);
        return Arrays.equals(resultArray, b);
    }
}
