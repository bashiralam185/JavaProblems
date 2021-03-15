public class SpacesNumbers {
    public static void main(String[] args){
        int count=5;
        int numCounter=0;
        int conter=1;
        while(count>0){
            for (int i=count; i>0; i--){
                System.out.print(" ");
            }
            numCounter++;
            for(int j =numCounter; j>0; j--){
                System.out.print(conter);
            }
            conter++;
            System.out.println("");
            count--;
        }
    }
}
