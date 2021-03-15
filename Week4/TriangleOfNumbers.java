import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        int x= n;
        for( int i =0; i <n; i++){
            x--;
            int count=1;
            int j=0;
            while(j!=n){
                if(j>=x){
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");

        }
    }
}
