
import java.util.Arrays;
import java.util.Scanner;

public class djfh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of available rooms
        int k = scanner.nextInt(); // Number of rooms to be set up
        int[] rooms = new int[n];
        
        for (int i = 0; i < n; i++) {
            rooms[i] = scanner.nextInt();
        }
        
        Arrays.sort(rooms);
        
        int left = 1; // Minimum distance between rooms
        int right = rooms[n - 1] - rooms[0]; // Maximum possible distance
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canPlaceKRooms(rooms, mid, k)) {
                // We can maintain a minimum distance of 'mid' between rooms
                // Try to increase the minimum distance
                left = mid + 1;
            } else {
                // We cannot maintain a minimum distance of 'mid' between rooms
                // Reduce the minimum distance
                right = mid;
            }
        }
        
        System.out.println(left - 1); // Subtract 1 to get the largest minimum distance
    }
    
    private static boolean canPlaceKRooms(int[] rooms, int minDistance, int k) {
        int count = 1; // Number of rooms placed
        int prevRoom = rooms[0];
        
        for (int i = 1; i < rooms.length; i++) {
            if (rooms[i] - prevRoom >= minDistance) {
                // We can place a room with at least 'minDistance' distance
                prevRoom = rooms[i];
                count++;
                
                if (count == k) {
                    // We have placed all required rooms with minimum distance
                    return true;
                }
            }
        }
        
        return false;
    }
}
