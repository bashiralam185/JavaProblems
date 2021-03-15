public class NestedNumbers {
    public static void main(String[] args){
        int count=0;
        while(count!=3){
            int Count=0;
            while(Count!=10){
                int counter=0;
                while(counter!=3){
                    System.out.print(Count);
                    counter++;
                }
                Count++;
            }
            System.out.println("");
            count++;
        }
    }
}
