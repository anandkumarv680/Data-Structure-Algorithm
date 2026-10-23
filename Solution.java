class Solution {

    public static  void bs(int[] nums, int st, int en, int min) {
        if (st > en) {
            return;
        }
        int mid = st + (en - st) / 2;

        if (nums[st] < nums[mid]) {
            min = Math.min(min, nums[st]);
            bs(nums, mid + 1, en, min);
        } else {
            min = Math.min(min, nums[mid]);
            bs(nums, st, mid, min);
        }
    }

    public static  int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        bs(nums, 0, nums.length - 1, min);
        return min;
    }

    public static void main(String[] args) {

        System.out.println(findMin(new int[] { 3, 4, 5, 1, 2 }));

    }
}