/**
 * @program: LeetCode
 * @description:
 * @author: lxy
 * @create: 2024-07-01 19:11
 **/
public class 两数之和 {
    public static void main(String[] args) {

        //给定一个整数数组 nums 和一个整数目标值 target,请你在该数组中找出和为目标值
        //target的那两个整数,并返回它们的数组下标,你可以假设每种输入只会对应一个答案
        //但是,数组中同一个元素在答案里不能重复出现

        int[] arr = {1,2,3,4,5,6,7};

        int target = 7;


        // 调用twoSum方法并打印返回的数组（索引）
        int[] indices = twoSum(arr, target);
        if (indices != null) {
            System.out.println("找到的两个数的索引为: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("在数组中没有找到和为" + target + "的两个数");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] +nums[j] == target) {

                    return new int[]{i, j};

                }
            }
        }
        return null;
    }

}
