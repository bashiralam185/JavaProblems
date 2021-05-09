public class NaturalNumber {
    private int num;

    public NaturalNumber(int num) {
        if(num < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.num=num;
    }


    public Classification getClassification() {
        int alSum = 0;
        if (num > 0) {
            for (int j = 1;  j< num; j++) {
                if (num % j == 0) {
                    alSum += j;
                }
            }
        }

        if (alSum == num){
            return Classification.PERFECT;
        } else if (alSum > num){
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

}