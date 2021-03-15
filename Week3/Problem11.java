import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String number= input.next();
        String[] arrOfStr = number.split("", 5);

        if (number.length()==5){
            for (String a : arrOfStr)
                System.out.println(a);
        }
        else if(number.length() <5){
            System.out.println("Number is too short!");
        }
        else{
            System.out.println("Number is too long!");
        }
    }
}
