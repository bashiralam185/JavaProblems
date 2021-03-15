import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numArray = input.nextLine().trim().split(" ");
        try {
            int[] array = new int[numArray.length];
            for (int k = 0; k < numArray.length; k++) {
                array[k] = Integer.parseInt(numArray[k]);
            }
            maxSpan(array);
        }
        catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }
    public static void maxSpan(int[] array){
        int count2=0;
        int count3=1;
        int max=1;
        for(int x: array){
//            System.out.println(x);
            int count=1;
            for(int i=count3; i< array.length; i++){
                if(x==array[i]){
                    count++;
                    if(max<count){
                        max=count;
                    }
                }
                else {
                    count++;
                }
            }
            count3++;
        }
        System.out.println(max);
    }
}
