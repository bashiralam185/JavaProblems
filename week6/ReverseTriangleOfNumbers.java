import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        try{
            int num= input.nextInt();
            if(num<0){
                num=-(num);
            }
            int count=num;
            for(int i=num; i>0; i--){
                int spaces=num-i;
                int element=1;
                for(int j=0;j<spaces; j++) {
                    System.out.print("  ");
                }
                for(int k=spaces; k<num; k++){
                    System.out.print(element+" ");

                    element++;
                }
                System.out.println("");
            }
        }
        catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
}
