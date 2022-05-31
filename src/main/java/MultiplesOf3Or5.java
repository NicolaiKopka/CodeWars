public class MultiplesOf3Or5 {

//    public int solution(int numberToCalculate) {
//        if(numberToCalculate < 1) {
//            return 0;
//        }
//        int result = 0;
//        for (int i = 1; i < numberToCalculate; i++) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                result += i;
//            } else if(i % 3 == 0) {
//                result += i;
//            } else if(i % 5 == 0) {
//                result += i;
//            }
//        }
//        return result;
//    }

    public int solution(int numberToCalculate) {
        if(numberToCalculate < 1) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < numberToCalculate; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

}
