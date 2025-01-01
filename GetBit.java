import java.util.Scanner;

public class GetBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pos = sc.nextInt();

        // Finding the bitmask of the number based on the position given
        int bitMask = num << pos;

        // Operation : AND Operation to get the bit
        int result = bitMask & num;

        // if the bit is 0 then the bit at the given position is 0
        // Otherwise the bit at the given position is 1
        if (result == 0) {
            System.out.println("Bit : 0");
        } else {
            System.out.println("Bit : 1");
        }

    }
}