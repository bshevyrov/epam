package ua.com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void whenPositiveThanTrue() {
        boolean actual;
        boolean expected = true;
        actual = StringUtils.isPositiveNumber("123");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenNegativeThanFalse() {
        boolean actual;
        boolean expected = false;
        actual = StringUtils.isPositiveNumber("-123");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenNullThanFalse() {
        boolean actual;
        boolean expected = false;
        actual = StringUtils.isPositiveNumber(null);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenStringThanFalse() {
        boolean actual;
        boolean expected = false;
        actual = StringUtils.isPositiveNumber("Hello");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenMaxLongThanTrue() {
        boolean actual;
        boolean expected = true;
        actual = StringUtils.isPositiveNumber(String.valueOf(Long.MAX_VALUE));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenZeroThanTrue() {
        boolean actual;
        boolean expected = true;
        actual = StringUtils.isPositiveNumber("0");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenDoubleThanFalse() {
        boolean actual;
        boolean expected = false;
        actual = StringUtils.isPositiveNumber("22.3");
        Assertions.assertEquals(expected, actual);
    }
}