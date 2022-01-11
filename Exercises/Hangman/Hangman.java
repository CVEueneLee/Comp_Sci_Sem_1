public class Hangman {

    private String guessingWord;
    private int numTries;

    public Hangman() {
        numTries = 5;
        generateWord();
    }

    public Hangman(int x) {
        this();
        numTries = x;
    }

    public int guessCheck(String s, int i) {
        char[] c = guessingWord.toCharArray();
        for(int x = i; x < c.length; x++) {
            if(Character.toString(guessingWord.charAt(x)).equalsIgnoreCase(s)) {
                return x;
            }
        }
        return -1;
    }

    public boolean checkWin(boolean[] arr) {

        for(boolean b : arr) {
            if (b != true) {
                return false;
            }
        }
        return true;

    }

}





