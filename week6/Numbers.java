import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        try{
            int num= input.nextInt();
            if(num<0){
                num=-(num);
            }
            System.out.print(num+"+"+(num*10+num) +"+"+((num*100)+(num*10+num))+"=");
            System.out.println((num)+(num*10+num)+(num*100)+(num*10+num));
        }
        catch (Exception e){
            System.out.println("invalid input");
        }

    }
}
