package lesson1.trananhquan;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int[] ans = new int[2*a];
        for (int i = 0; i < a; i++) {
            ans[i] = nums[i];
            ans[i + a] = nums[i];
        }
        return ans;
    }
}
