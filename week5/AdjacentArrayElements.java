import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array= new int[10];
        try{
            for(int i=0; i<10; i++){
                array[i]=input.nextInt();
            }
            System.out.println(mainFunction(array));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }

    public static int mainFunction(int[] array){
        int num=0;
        int[] Arr= new int[5];
        for(int i=0; i<9; i++){
            if(array[i]==array[i+1] && check(Arr, array)){
                Arr[num]=array[i];
                num++;
            }
        }
        return num;
    }
    public static boolean check(int[] Arr, int[] array){
        int count=0;
        for(int i: Arr){
            for(int j: array){
                if(i==j){
                    count++;
                }
            }
        }
        if(count!=0){
            return false;
        }
        else{
            return true;
        }
    }
}
