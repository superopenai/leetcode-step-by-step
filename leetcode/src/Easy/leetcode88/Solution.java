package leetcode88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i =0,j=0;
        int[] nums3 = new int[m];
        System.arraycopy(nums1, 0, nums3, 0, m);
        for (int k = 0; k < nums1.length; k++) {
            if (i == m) {
                nums1[k] = nums2[j];
                j++;
            } else if (j == n) {
                nums1[k] = nums3[i];
                i++;
            } else if (nums3[i] < nums2[j]) {
                nums1[k] = nums3[i];
                i++;
            } else if (nums3[i] > nums2[j]){
                nums1[k] = nums2[j];
                j++;
            }else if (nums3[i] == nums2[j])
            {
                nums1[k] = nums2[j];
                nums1[k+1] = nums3[i];
                i++;j++;k=k+1;
            }


        }
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);

    }

}