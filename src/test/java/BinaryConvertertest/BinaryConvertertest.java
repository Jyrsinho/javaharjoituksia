package BinaryConvertertest;

import BinaryConverter.BinaryConverter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryConvertertest {


@Test
    public void testShouldReturn8CharacterLongString() {
    BinaryConverter converter = new BinaryConverter();
    String result = converter.convertToEightBitBinary(4);
    assertTrue(result.length() == 8);
}

@Test
    public void testShouldReturnZeroOneWhenGivenIntergerOne() {
    BinaryConverter converter = new BinaryConverter();
    assertEquals("00000001", converter.convertToEightBitBinary(1));
}
}

