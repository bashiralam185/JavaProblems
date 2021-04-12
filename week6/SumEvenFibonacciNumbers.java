import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(evenFibonacciSum(num));
    }


    public static int evenFibonacciSum(int num) {
        int lastnum = 1;
        int currentnum = 2;
        int evenSum = 0;
        do {
            if (currentnum % 2 == 0) {
                evenSum += currentnum;
            }
            int newFibonacci = currentnum + lastnum;
            lastnum = currentnum;
            currentnum = newFibonacci;
        } while (currentnum < num);
        return evenSum;
    }
}
