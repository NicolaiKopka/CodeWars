public class DontGive5 {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1,9));
    }

    public static int dontGiveMeFive(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end ; i++) {
            int currNumber = i;
            if(currNumber < 0) {
                currNumber *= -1;
            }
            boolean contains5 = false;
            while(currNumber > 0) {
                int testDigit = currNumber % 10;
                if (testDigit == 5) {
                    contains5 = true;
                    break;
                }
                currNumber = (int) currNumber / 10;
            }
            if(!contains5) {
                counter += 1;
            }
        }
        return counter;
    }
}
