import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = input.nextInt();
        int binary[] = new int[40];
        int index = 0;
        System.out.printf("Binary of %d is ", num);
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;

            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
        }
    }
}
