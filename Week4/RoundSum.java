import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class RoundSum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number1= input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.println("Rounded sum is " +roundSum(number1, number2, number3));
    }

    private static int roundSum(int number1, int number2, int number3) {
        int sum= number1+number2+number3;
        if (sum%10==0 || sum%10>=5){
            return 10*((sum/10)+1);
        }
        else{
            return 10*(sum/10);
        }
    }
}
