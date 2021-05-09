public class RnaTranscription {
    private String DNA;

    public RnaTranscription() {
    }

    public String transcribe(String DNA) {
        String RNA = "";
        for (int i = 0; i < DNA.length(); i++){
            if (DNA.charAt(i) == 'G'){
                RNA += 'C';
            } else if (DNA.charAt(i) == 'C') {
                RNA += 'G';
            } else if (DNA.charAt(i) == 'T') {
                RNA += 'A';
            } else if (DNA.charAt(i) == 'A') {
                RNA += 'U';
            } else
                RNA += DNA.charAt(i);
        }
        return RNA;
    }
}
