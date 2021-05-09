public class Hamming {
    private String one;
    private String two;

    public Hamming(String s1, String s2) {
        if (s1.length() == s2.length()){
            this.one = s1;
            this.two = s2;
        } else {
            throw new IllegalArgumentException ("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int counter = 0;
        for(int k = 0; k < one.length(); k++){
            if (one.charAt(k) != two.charAt(k)){
                counter += 1;
            }
        }
        return counter;
    }
}