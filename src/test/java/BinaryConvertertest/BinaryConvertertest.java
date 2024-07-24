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

        assertEquals("00000001", binaryConverter.convertToEightBitBinary(1));
    }

    @Test
    public void testShouldReturn0000000WhenGivenIntegerZero() {
        assertEquals("00000000", binaryConverter.convertToEightBitBinary(0));
}

    @Test
    public void testShouldReturn00000010WhenGivenIntegerTwo() {
        assertEquals("00000010", binaryConverter.convertToEightBitBinary(2));
    }

    @Test
    public void testShouldReturn00000100WhenGivenIntegerFour() {
        assertEquals("00000100", binaryConverter.convertToEightBitBinary(4));
    }

    @Test
    public void testShouldReturn0000011WhenGivenIntegerThree() {
        assertEquals("00000011", binaryConverter.convertToEightBitBinary(3));
    }

    @Test
    public void testShouldReturn11111111henGivenInteger255() {
        assertEquals("11111111", binaryConverter.convertToEightBitBinary(255));
    }
}

