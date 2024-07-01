import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: lxy
 * @create: 2024-07-01 21:19
 **/
public class 回文数 {
    public static void main(String[] args) {

            //给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
            //回文数 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
            //例如，121 是回文，而 123 不是。
        boolean palindrome = isPalindrome(131131);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        char[] charArray = str.toCharArray();

        char n;

        for (int i = 0,j = charArray.length - 1; i < charArray.length && j > i; i++,j--) {
            n = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = n;
        }

        if (str.equals(new String(charArray))) {
            return true;
        }
        return false;
    }
}
