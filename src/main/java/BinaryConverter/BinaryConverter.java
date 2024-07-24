package BinaryConverter;

public class BinaryConverter {


    public BinaryConverter() {
    }



    /**
     * Converts given integer to 8bit binary String
     * @param integer number to be converted
     * @return 8bit binary string representing the binary value of a given integer
     */
    public String convertDecimalToBinary(int integer) {
        if (integer == 0) return "0";
        StringBuilder binaryNumber = new StringBuilder();

        while (integer > 0) {
            if (integer % 2 == 0) {
                binaryNumber.insert(0,"0");
            }
            else binaryNumber.insert(0,"1");
            integer = integer / 2;
        }

         return binaryNumber.toString();
    }
}
