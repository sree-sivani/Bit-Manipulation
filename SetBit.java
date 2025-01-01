import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pos = sc.nextInt();

        // Finding the bit mask based on the position given
        int bitMask = 1 << pos;

        // Operation : OR

        int result = bitMask | num;

        // The bit will be changed
        // If 1 then to 0
        // If 0 then to 1

        System.out.println(result);

    }
}
