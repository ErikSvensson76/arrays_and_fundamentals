package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    //This is a comment
    @Test
    public void given_two_numbers_sum_should_return_correct_value(){
        double number1 = 3.7;
        double number2 = 3.4;

        double expected = 7.1;
        double result = App.sum(number1,number2);

        assertEquals(expected, result, 0);
    }

}
