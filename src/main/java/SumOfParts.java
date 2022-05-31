public class SumOfParts {

    public static int[] sumParts(int[] ls) {
        int[] sumArray = new int[ls.length + 1];
        int currSum = 0;
        for (int number : ls) {
            currSum += number;
        }
        sumArray[0] = currSum;
        for (int i = 1; i < sumArray.length; i++) {
            currSum = sumArray[i-1] - ls[i-1];
            sumArray[i] = currSum;
        }
        return sumArray;
    }
}
