package leetcode.editor.en;

// $P238_ProductOfArrayExceptSelf

//leetcode submit region begin(Prohibit modification and deletion)
class Solution238 {
    // Approach 1: Prefix and Suffix Product
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        right[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0 ; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }

    // Approach 2: Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public int[] productExceptSelf1(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tmp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                else tmp *= nums[j];
            }
            result[i] = tmp;
        }
        return result;
    }

    // Approach 3: Divide the product of array with the number
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Cons: Cannot handle element 0 in the array. (Divide 0 @.@)
    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int tmp = 1;
        for (int num : nums) {
            tmp *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = tmp / nums[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
