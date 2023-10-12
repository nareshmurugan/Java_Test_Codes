import java.util.PriorityQueue;

public class Mitsogo {

    public static int maxTreeHeight(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int water : arr) {
            maxHeap.offer(water);
        }

        int maxHeight = 0;

        while (!maxHeap.isEmpty()) {
            int water = maxHeap.poll();

            if (water > maxHeight) {
                maxHeight+=water;
            }
        }

        return maxHeight;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,2}; // Array representing the amount of water in each glass
        int maxHeight = maxTreeHeight(arr);
        System.out.println("Maximum possible height of the tree: " + maxHeight);
    }
}