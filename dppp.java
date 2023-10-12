import java.util.Scanner;

public class dppp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of houses
        int[] donations = new int[N];
        
        for (int i = 0; i < N; i++) {
            donations[i] = scanner.nextInt();
        }
        
        int maxDonation = getMaxDonation(donations);
        System.out.println(maxDonation);
    }
    
    private static int getMaxDonation(int[] donations) {
        int N = donations.length;
        int[] dp1 = new int[N]; // Stores maximum donations for inclusive range 0 to N-2
        int[] dp2 = new int[N]; // Stores maximum donations for inclusive range 1 to N-1
        
        dp1[0] = donations[0];
        dp2[1] = donations[1];
        
        // Calculate maximum donations for inclusive ranges 0 to N-2
        for (int i = 2; i < N - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + donations[i]);
        }
        
        // Calculate maximum donations for inclusive ranges 1 to N-1
        for (int i = 2; i < N; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + donations[i]);
        }
        
        // Return the maximum of the two cases
        return Math.max(dp1[N - 2], dp2[N - 1]);
    }
}