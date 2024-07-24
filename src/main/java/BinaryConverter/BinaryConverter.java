package BinaryConverter;

public class BinaryConverter {


    public BinaryConverter() {
    }



    /**
     * Converts given integer to  binary String
     * @param integer number to be converted
     * @return binary string representing the binary value of a given integer
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


    /**
     * Converts given integer to binary String of length determine by the parameter "bits"
     * @param integer to be converted
     * @param bits amount of bits in the binary String
     * @return binary String of the length determined by the parameter "bits"
     */
    public String convertDecimalToBinary(int integer, int bits) {
        StringBuilder binaryNumber = new StringBuilder();

        while (integer > 0) {
            if (integer % 2 == 0) {
                binaryNumber.insert(0,"0");
            }
            else binaryNumber.insert(0,"1");
            integer = integer / 2;
        }

        //add rest of the bits and spaces
        int numberOfZeros = bits - binaryNumber.length();
        for (int i = 0; i < numberOfZeros; i++) {
            binaryNumber.insert(0,"0");
        }
        //add spaces
        for (int i = 4; i < binaryNumber.length(); i++) {
            binaryNumber.insert(i," ");
            i += 4;
        }

        return binaryNumber.toString();
    }
}
