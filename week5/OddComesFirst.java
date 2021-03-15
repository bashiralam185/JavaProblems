import java.util.Scanner;

public class OddComesFirst {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array= new int[num];
        for( int i=0; i<num; i++){
            int element= input.nextInt();
            array[i]=element;
        }
        printArray(main(array));
    }


    public static int[] main(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++){
            int temp;
            if(array[i]%2!=0){
                temp=array[i];
//                array[i]=array[count];
//                count++;
                int temp2=array[count];
                for(int j=count; j<i; j++ ){
                    int temp3= array[j+1];
                    array[j+1]=temp2;
                    temp2=temp3;
                }
                array[count]=temp;
                count++;
//                temp=array[i];
//                array[i]=array[count];
//                array[count]=temp;
//                count++;
            }
        }
        return array;
    }


    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
