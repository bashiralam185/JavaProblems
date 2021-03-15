public class SpacedNumbers {
    public static void main(String[] args){
        int count=5;
        int counter=1;
        while (count>0){
            for(int i =count; i>0; i--){
                System.out.print(" ");
            }
            System.out.println(counter);
            counter++;
            count--;
        }
    }
}
