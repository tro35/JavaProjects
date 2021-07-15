package Charsequence;

public class Gnirt implements CharSequence {
    private String inputString;

    public Gnirt(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public int length() {
        return this.inputString.length();
    }

    @Override
    public char charAt(int i) {
        //return this.inputString.charAt(this.inputString.length()-1);
        return this.inputString.charAt(this.inputString.length() - i - 1);
    }

    @Override
    public CharSequence subSequence(int s, int e) {
        String outputResult = "";
        for (int i = s; i < e; i++) {
            outputResult += this.inputString.charAt(this.inputString.length() - i - 1);
        }
        return outputResult;
    }
}
