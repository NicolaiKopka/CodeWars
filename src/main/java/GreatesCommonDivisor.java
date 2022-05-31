import java.lang.management.MemoryType;

public class GreatesCommonDivisor {

    public static void main(String[] args) {
        System.out.println(calculate(30, 12));
    }

    public static int compute(int x, int y) {
        int maxNum = Math.max(x, y);
        int minNum = Math.min(x, y);
        int result = 0;
        for (int i = minNum; i > 0 ; i--) {
            if(minNum % i == 0 && maxNum % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int calculate(int x, int y) {
        return gcd(Math.max(x, y), Math.min(x, y));
    }

    public static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }
}
