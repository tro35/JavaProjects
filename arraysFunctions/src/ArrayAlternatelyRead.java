import java.util.Arrays;

public class ArrayAlternatelyRead {
    public static void main(String[] args) {
        String[] first = new String[]{"banana", "apple"};
        String[] second = new String[]{"orange", "pear", "pear2", "pear3"};
        System.out.print(Arrays.toString(arrJoin(first,second)));
    }

    private static String[] arrJoin(String[] first, String[] second){
        String[] result = new String[first.length + second.length];
        for (int i = 0; i < result.length; i++) {
            if(i % 2 == 0 && i <= first.length){
                if(i == first.length){
                    result[i] = first[i - 1];
                }else{
                    result[i] = first[i];
                }
            }else{
                if(i <= first.length) {
                    result[i] = second[i - 1];
                }else{
                    result[i] = second[i - 2];
                }
            }
        }
        return result;
    }
}
