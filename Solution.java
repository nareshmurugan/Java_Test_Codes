import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};int k=3;
        int[]a=Arrays.copyOfRange(nums,0,k);
        name(a);
        int[]b=Arrays.copyOfRange(nums,k,nums.length);
        name(b);
        System.arraycopy(b, 0, nums, 0, b.length);
        name(nums);
        System.arraycopy(a, 0, nums, b.length, a.length);
    }
    public static void name(int[]a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}