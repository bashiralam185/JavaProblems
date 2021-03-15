import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array= new int[10];
        try{
            for(int i =0; i<10; i++){
                array[i]=input.nextInt();
            }
            System.out.println(mainFunction(array));

        }
        catch (Exception e){
            System.out.println("error");
        }

    }
    public static String mainFunction(int[] array){
        int number=0;
        int Count=0;
        for(int i=0; i<10; i++){
            number+=array[i];
            int count=0;
            for(int j=i+1; j<10; j++){
                count+=array[j];
            }
            if (number==count){
                Count++;
            }
        }
        if(Count!=0){
            return "Can be balanced";
        }
        else{
            return "Can not be balanced";
        }
    }
}