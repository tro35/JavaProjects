public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr){
        int localMax = 0;
        int globalMax = 0;

        for (int j : arr) {
            localMax = Integer.max(j, j + localMax);
            if (localMax > globalMax)
                globalMax = localMax;
        }
        return globalMax;
    }
}
