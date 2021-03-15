import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        double[] array= new double[num];
        for(int i =0; i<num; i++){
            double element= input.nextDouble();
            array[i]=element;
        }
        System.out.print(getNumber(array));
    }
    public static double getNumber(double[] array){
        double smallest=array[0];
        double small=array[0];
        for(int i =0; i<array.length; i++){
            if(smallest<array[i]){
                smallest=array[i];
            }
        }
        for(int j =0; j<array.length; j++){
            if(small>array[j]){
                small=array[j];
            }
        }
        for (int k=0; k<array.length; k++){
            if(small<array[k] && array[k]<smallest){
                small=array[k];
            }
        }
        return  small;

    }
}
