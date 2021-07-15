// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunnies(2,10));
    }
    private static int bunnies(int ears, int bunny){
        if(bunny == 1){
            return ears;
        }
        else{
            return ears + bunnies(ears, bunny - 1);
        }
    }
}
