public class BouncBall {
    public static void main(String[] args) {
        int bounceCount = bouncingBall(3.0, 0.66, 1.5);
        System.out.println(bounceCount);
    }

    public static int bouncingBall(double h, double bounce, double window) {
	    if(h > 0 && (bounce > 0 && bounce < 1) && window < h){
            if(h < window)
            return -1;
            else
            return 2 + bouncingBall((h * bounce), bounce, window);
        }
      return -1;
    }
}
