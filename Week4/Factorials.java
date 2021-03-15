import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number= input.nextInt();
        int factorial= 1;
        int count=1;
        System.out.println("X X!");
        System.out.println("0 1");
        while(count<=number){
            System.out.printf("%d %d", count, factorial*count);
            factorial=factorial*count;
            System.out.println("");
            count++;
        }
    }
}
