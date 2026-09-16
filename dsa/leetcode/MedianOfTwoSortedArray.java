package dsa.leetcode;

public class MedianOfTwoSortedArray {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            // Always binary search on the smaller array to get fewer possible partitions (lesser possibilities = easier to find the answer)
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int m = nums1.length;
            int n = nums2.length;

            int low = 0;
            int high = m;

            // Number of elements that should be on the left (+1 is useful because it handles both odd and even lengths.)
            int half = (m + n + 1) / 2;

            while (low <= high) {

                // Partition nums1
                int i = low + (high - low) / 2;

                // Partition nums2
                int j = half - i;

                // Elements just before and after the partition
                int left1max = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
                int right1min = (i == m) ? Integer.MAX_VALUE : nums1[i];

                int left2max = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
                int right2min = (j == n) ? Integer.MAX_VALUE : nums2[j];

                // Correct partition
                if (left1max <= right2min && left2max <= right1min) {

                    // Odd number of total elements
                    if ((m + n) % 2 == 1) {
                        return Math.max(left1max, left2max);
                    }

                    // Even number of total elements
                    return (Math.max(left1max, left2max)
                            + Math.min(right1min, right2min)) / 2.0;
                }

                // We have taken too many elements from nums1
                else if (left1max > right2min) {
                    high = i - 1;
                }

                // We have taken too few elements from nums1
                else {
                    low = i + 1;
                }
            }

            return 0.0;
        }


}
