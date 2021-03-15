import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int number= input.nextInt();
        System.out.print(number+" = ");
        factor(number);

    }
    private static void factor(int num){
        if (num%2==0){
            System.out.print("2 * ");
            num=num/2;
            factor(num);
        }
        else{
            System.out.println(num);

        }
    }
}
