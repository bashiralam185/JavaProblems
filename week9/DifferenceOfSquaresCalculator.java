public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo (int num){

        int sumOfN = (num * (num + 1)) / 2;
        int sqSumOfNum = sumOfN * sumOfN;

        return sqSumOfNum;
    }

    public int computeSumOfSquaresTo (int num){
        int sumSquareOfN = num * (num + 1) * (2 * num+1) / 6;
        return sumSquareOfN;
    }

    public int computeDifferenceOfSquares (int num){
        return computeSquareOfSumTo(num) - computeSumOfSquaresTo(num);
    }
}
