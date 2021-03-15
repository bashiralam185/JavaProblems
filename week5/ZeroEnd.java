import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            String string = input.nextLine().trim();
            String[] array = string.split(" ", -1);
            int[] arr = new int[array.length];
            mainFuction(array, arr);
        }
        catch (Exception e){
            System.out.println("Input error");
        }


    }
    public static void mainFuction(String[] array, int[] arr){
        int count=0;
        for(String i: array){
            int element=Integer.parseInt(i);
            if(element!=0){
                arr[count]=element;
                count++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
