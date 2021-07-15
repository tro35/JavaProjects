import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
    }

    public static int [] bubble(int inArray[]){
        int temp;
        for (int i = 0; i < inArray.length-1; i++) {
            for (int j = 0; j < inArray.length - i - 1; j++) {
                if(inArray[j] > inArray[j+1]){
                    temp = inArray[j];
                    inArray[j] = inArray[j+1];
                    inArray[j+1] = temp;
                }
            }
        }
        return inArray;
    }
    
}
