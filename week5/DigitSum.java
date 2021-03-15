import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        try{
            long number=input.nextLong();
            if(number<0){
                number=-(number);
            }
            System.out.println(digitSum(number));
        }
        catch (ArithmeticException e){
            System.out.println("45");
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
    public static int digitSum(long number){
        int sum=0;
        int divider=10;
        int i=0;
        while(true){
            if(number/divider==0){
                int x= (int) ((number/Math.pow(10, i-1))/10);
                sum+=x;
                break;
            }
            else{
                sum+=((number/Math.pow(10, i))%10);
                divider*=10;
                i++;
            }
        }
        return sum;

    }
}
