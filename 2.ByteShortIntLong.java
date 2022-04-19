public class Main {
    public static void main(String[] args) {

        int myValue = 10000;  //1int occupies 32bits

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;  //1byte occupies 8bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;  //1short occupies 16bits
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;  //1Long occupies 64bits
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;  //with L on the end,so that treat it as a Long
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);  //cast:let Java treat the value following the () as a Byte

        short myNewShortValue = (short)(myMinShortValue / 2);

        long Challenge = 50000L + 10L * (myNewByteValue + bigShortLiteralValue + myTotal);
        System.out.println(Challenge);
        short shortTotal = (short)(1000 + 10 * (myNewByteValue + bigShortLiteralValue + myTotal));
        System.out.println(shortTotal);
    }
}
