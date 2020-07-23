package junit5.tdd;

public class FizzBuzz {

    public String playFizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
