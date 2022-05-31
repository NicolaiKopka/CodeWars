public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        char[] pinArray = pin.toCharArray();
        for(char c : pinArray) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return pin.length() == 4 || pin.length() == 6;
    }
}
