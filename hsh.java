public class hsh {

    public static int maximizeTreeHeight(int n, int[] arr) {
        // Initialize a 2D array to store the maximum height achievable
        // dp[i][j] represents the maximum height using the first i glasses and pouring j liters of water
        int[][] dp = new int[n + 1][n * 100 + 1]; // The maximum possible total water is n * 100

        // Base case: With 0 liters of water, the height of the tree is 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // Iterate through the glasses and update the maximum height achievable
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 100; j++) {
                dp[i][j] = dp[i - 1][j]; // By default, don't pour water from the current glass

                if (arr[i - 1] <= j) {
                    // If we pour the water from the current glass, update the maximum height
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - arr[i - 1]] + arr[i - 1]);
                }
            }
        }

        return dp[n][n * 100];
    }

    public static void main(String[] args) {
        // Sample input
        int n = 3;
        int[] arr = {2, 1, 3};

        // Calculate the maximum possible height of the tree
        int maxHeight = maximizeTreeHeight(n, arr);
        System.out.println("Maximum possible height of the tree: " + maxHeight); // Output: 5
    }
}