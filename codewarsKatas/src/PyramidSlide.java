import java.util.Arrays;

public class PyramidSlide {
    public static void main(String[] args) {
        int[][] pyramid = new int [][] {{3},{7,4},{2,4,6},{8,5,9,3}};
        System.out.println(longestSlideDown(pyramid));
    }

    public static int longestSlideDown(int[][] pyramid) {
        int[][] pyramidSum = pyramid;

        for ( int i = pyramid.length -2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramidSum[i][j] = pyramid[i][j] + Math.max(pyramid[i+1][j], pyramid[i+1][j+1]);
            }
        }
        int result = pyramidSum[0][0];
        return result;
    }
}
