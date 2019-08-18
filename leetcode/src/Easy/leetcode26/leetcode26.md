## 26. 删除排序数组中的重复项

**给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成**

>要求在O（1）的空间复杂度内完成，这就不能用Set来去掉重复元素。，一个做法是设置一个变量，出现重复项就+1.
>另一种做法是官方给出的快慢指针做法。由于本人较菜b。没有理解好官方题解emmmmm。

```java
class  Solution
    //官方题解
{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
```
![](https://i.loli.net/2019/08/18/RWnYBMphSCaKUry.png)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int step = 0;
        //表示重复元素个数。
        for(int j=1; j<nums.length;j++) {
            if(nums[j]==nums[j-1]) {
                // 元素与上个元素相等，表示当前元素属于重复元素
                step++;
            } else {
                // 该元素是一个非重复元素
                nums[j-step] = nums[j];
            }
        }
        return nums.length-step;
        //总长度减去重复的个数
    }
}

```
![](https://i.loli.net/2019/08/18/gYULkdTKfFoWMDr.png)