/**
 * @program: LeetCode
 * @description:
 * @author: lxy
 * @create: 2024-07-02 10:22
 **/
public class 只出现一次的数字 {
    public static void main(String[] args) {
        //给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
        //你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
        int[] arr = {1,1,2,4,5,5,4};
        int i = singleNumber(arr);
        System.out.println(i);

        //算法步骤：
        //初始化一个变量 n 为 0，用于存储最终的结果。
        //遍历数组 nums 中的每个元素，对于每个元素 nums[i]，都将其与 n 进行异或运算，并将结果存回 n。
        //由于数组中除了一个元素外，其他元素都出现两次，根据异或运算的性质，那些成对出现的元素在异或运算中都会相互抵消（变成 0），
        // 而唯一只出现一次的元素则会与 n（初始为 0）进行异或运算，最终保留在 n 中。
        //遍历结束后，n 中存储的就是那个只出现一次的元素。


    }

    public static int singleNumber(int[] nums) {

        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            n ^= nums[i];
        }
        return n;
    }
}
