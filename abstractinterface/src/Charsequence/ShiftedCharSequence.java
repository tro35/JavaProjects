package Charsequence;

public class ShiftedCharSequence implements CharSequence {
    private String inputString;
    private int shift;

    public ShiftedCharSequence(String inputString, int shift) {
        this.inputString = inputString;
        this.shift = shift;
    }

    @Override
    public int length() {
        return this.inputString.length();
    }

    @Override
    public char charAt(int shift) {
        //return this.inputString.charAt(this.inputString.length()-1);

        return this.inputString.charAt(shift + this.shift);
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
