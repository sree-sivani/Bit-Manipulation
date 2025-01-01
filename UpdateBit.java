import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter choice whether they want to change 1 or 0
        System.out.println("Enter 1 : To change into 1");
        System.out.println("Enter 0 : To change into 0");
        int choice = sc.nextInt();

        int num = sc.nextInt();
        int pos = sc.nextInt();

        // Finding the Bitmask based on the given position
        int bitmask = 1 << pos;

        if (choice == 1) {
            int result = bitmask | num;
            System.out.println("Value after Updating : " + result);
        } else {
            int bitmaskNot = ~(bitmask);
            int result = bitmaskNot & num;
            System.out.println("Value after Updating : " + result);
        }

    }
}
