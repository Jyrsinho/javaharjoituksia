package BinaryConverter;

public class BinaryConverter {

    int[] powersOfTwo = { 1, 2, 4, 8, 16, 32, 64, 128 };


    public BinaryConverter() {
    }

    /**
     * Converts given integer to 8bit binary String
     * @param integer number to be converted
     * @return 8bit binary string representing the binary value of a given integer
     */
    public String convertToEightBitBinary(int integer) {


        StringBuilder binaryNumber = new StringBuilder();

        for (int i = powersOfTwo.length-1; i >= 0; i--) {
            if (powersOfTwo[i] <= integer) {
                binaryNumber.append('1');
                integer -= powersOfTwo[i];
            }
            else {
                binaryNumber.append('0');
            }
        }

        return binaryNumber.toString();
    }
}
