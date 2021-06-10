public class FizzBuzzTranslate {
    public static String translate(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        StringBuilder outcome = new StringBuilder();

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        }
        else if (isDivisibleBy5) {
            return "Buzz";
        }
        else if (isDivisibleBy3) {
            return "Fizz";
        }

        String numberStr = "" + number;
        char[] numberChar = new char[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            numberChar[i] = numberStr.charAt(i);
        }
        for (char c : numberChar) {
            switch (c) {
                case '0' -> outcome.append("khong ");
                case '1' -> outcome.append("mot ");
                case '2' -> outcome.append("hai ");
                case '3' -> {
                    return "Fizz";
                }
                case '4' -> outcome.append("bon ");
                case '5' -> {
                    return "Buzz";
                }
                case '6' -> outcome.append("sau ");
                case '7' -> outcome.append("bay ");
                case '8' -> outcome.append("tam ");
                case '9' -> outcome.append("chin ");
            }
        }
        return outcome.toString();
    }
}
