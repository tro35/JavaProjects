public class SineWave {
    public static void main(String[] args) {
        int num = 20;
        for (double y = 1; y >= -1; y -= 0.15) {
            for (double x = 0; x <= num; x += 0.15) {
                double sin = Math.sin(x);
                if ( (0.1+y) >= sin && (y-0.1) <= sin )
                    System.out.print("█");
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
