package leetcode4;

/**
 * @author superning
 * @Classname Solution
 * @Description 4. 寻找两个有序数组的中位数
 * @Date 2020/4/18 16:20
 * @Created by superning
 */
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        int[] res = new int[total];
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        if (total % 2 == 0) {
            j = total / 2;
            i = j - 1;
        } else {
            i = total / 2;
            j = i;
        }
        while (index <= j && index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                res[index] = nums1[index1];
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                res[index] = nums2[index2];
                index2++;
            } else {
                res[index] = nums1[index1];
                    index++;
                    //为了和下面代码符合，先让index+1，当index-1==j的时候表示已经找到中位数了
                if (index-1==j){
                    break;
                }
                res[index] = nums2[index2];
                index1++;
                index2++;
            }
            index++;
        }
        //如果现在还没找到中位数
        // index-1 是因为上面的循环会导致index多加1
        if (index-1!= j) {
            //看那个数组还没完
            //以及上面的循环会导致index1 或者index2 多加1
            if (index1 == nums1.length ) {
                while (index <= j && index2 < nums2.length) {
                    res[index] = nums2[index2];
                    index++;
                    index2++;
                }
            } else {
                while (index <= j && index1 < nums1.length) {
                    res[index] = nums1[index1];
                    index++;
                    index1++;
                }
            }

        }

        //偶数
        if (i != j) {
            // 因为index 是多加1的,所以 j应该是index-1，i应该是index-2
            return (res[--index] + res[index - 1]) / 2.0;
        } else {
            //奇数
            return res[--index] / 1.0;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2};
        int[] n2 = {1, 2};
        System.out.println(findMedianSortedArrays(n1, n2));
    }
}