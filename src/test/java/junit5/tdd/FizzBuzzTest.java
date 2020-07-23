package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when

        String actual = fizzBuzz.playFizzBuzz(number);
        //then

        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_given_3() {
        //given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when

        String actual = fizzBuzz.playFizzBuzz(number);
        //then

        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_given_5() {
        //given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when

        String actual = fizzBuzz.playFizzBuzz(number);
        //then

        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_whizz_when_play_fizz_buzz_given_7() {
        //given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when

        String actual = fizzBuzz.playFizzBuzz(number);
        //then

        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizz_buzz_when_play_fizz_buzz_given_3_5() {
        //given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_fizz_whizz_when_play_fizz_buzz_given_21() {
        //given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_buzz_whizz_when_play_fizz_buzz_given_35() {
        //given
        int number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("BuzzWhizz", actual);
    }
}
