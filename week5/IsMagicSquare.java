import java.util.Scanner;

public class IsMagicSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int col= input.nextInt();
        int row= input.nextInt();
        int Sum=0;
        int[][] array= new int[col][row];
        if(col== row){
            for(int i=0; i<col;i++){
                int sum=0;
                for(int j=0; j<row; j++){
                    array[i][j]=input.nextInt();
                    sum+=array[i][j];

                }
                Sum=sum;
            }
        }
        else{
            System.out.println("not a square matrix");
        }
        isMagicSquare(array, Sum);
    }
    public static void isMagicSquare(int[][] array, int sum){
        int count =0;
        int diagonal=0;
        for(int k=0; k<array.length; k++){
            int total=0;
//            int diagonal=0;
            for(int l=0; l<array.length; l++){
                total+=array[k][l];
                if(k==l){
                    diagonal+=array[k][l];
                }
            }
            if(total==sum){
                continue;
            }
            else{
                count++;
            }
        }
        if(diagonal!=sum){
            count++;
        }

        if(count==0){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
