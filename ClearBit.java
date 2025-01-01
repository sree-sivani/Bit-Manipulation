import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pos = sc.nextInt();

        // Findign the bitmask based on the given position
        int bitMask = 1 << pos;

        // Operation : AND operation between number and NOT i.e, ~(BitMask)

        // Finding the NOT value of the bitmask
        int bitMaskNot = ~(bitMask);

        // Finding the AND value for bitMaskNot and the num
        int result = bitMaskNot & num;

        System.out.println("Value after clearing the bit at the given position : " + result);

    }
}
