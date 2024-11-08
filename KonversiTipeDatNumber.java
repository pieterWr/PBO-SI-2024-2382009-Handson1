public class KonversiTipeDatNumber {
    public static void main(String[] args) {
        // widening
        short tipeDataShort = 10;
        int tipedataInt = tipeDataShort;
        long tipeDataLomg = tipedataInt;

        // Naroowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        // Number overflow
        int tipeDataInteger = 128;
        byte tipeDataByteConverted = (byte) tipeDataInteger;
        System.out.println(tipeDataByteConverted);
    }
}