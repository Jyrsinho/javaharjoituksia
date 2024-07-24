package BinaryConvertertest;

import BinaryConverter.BinaryConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryConvertertest {

    private BinaryConverter binaryConverter;

    @BeforeEach
    public void setUp()  {
        binaryConverter = new BinaryConverter();
    }


    @Test
    public void testShouldReturnZeroOneWhenGivenIntergerOne() {

        assertEquals("1", binaryConverter.convertDecimalToBinary(1));
    }

    @Test
    public void testShouldReturn0000000WhenGivenIntegerZero() {
        assertEquals("0", binaryConverter.convertDecimalToBinary(0));
}

    @Test
    public void testShouldReturn00000010WhenGivenIntegerTwo() {
        assertEquals("10", binaryConverter.convertDecimalToBinary(2));
    }

    @Test
    public void testShouldReturn00000100WhenGivenIntegerFour() {
        assertEquals("100", binaryConverter.convertDecimalToBinary(4));
    }

    @Test
    public void testShouldReturn0000011WhenGivenIntegerThree() {
        assertEquals("11", binaryConverter.convertDecimalToBinary(3));
    }

    @Test
    public void testShouldReturn11111111henGivenInteger255() {
        assertEquals("11111111", binaryConverter.convertDecimalToBinary(255));
    }


}

