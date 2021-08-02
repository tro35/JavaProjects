public class BitCounting {
    public static void main(String[] args) {
        int bitCountResult = countBits(-1);
        System.out.println(bitCountResult);
    }
    public static int countBits (int n){
        String binaryString = "";        
        binaryString = Integer.toBinaryString(n);                
        int output = 0;
        if(n > 0){
            for (int i = 0; i < binaryString.length(); i++) {
                if(binaryString.charAt(i) == 49)
                output += 1;
            }
        }else{
        System.out.println("Enter positive integer number");
        }
        return output;
    }
}
