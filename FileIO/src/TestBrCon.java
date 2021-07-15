public class TestBrCon {
    public static void main(String[] args) {
        int i,j;
        /*whizlabs:
        for (i = 1; i < 4; i++) {
            j=1;
            while(j<4){
                if(j%2 == 0){
                    break whizlabs;
                }
                j++;
                System.out.println("inner");
            }
            System.out.println("outer");
        }*/

        whizlabs:
        for (i = 1; i < 4; i++) {
            j=1;
            while(j<4){
                j++;
                if(j%2 == 0){
                    continue whizlabs;
                }
                j++;
                System.out.println("inner");
            }
            System.out.println("outer");
        }
    }
}
