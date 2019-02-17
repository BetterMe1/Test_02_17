package xust;

import java.util.ArrayList;
import java.util.List;


/*
724. 寻找数组的中心索引
给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。

示例 1:
输入: 
nums = [1, 7, 3, 6, 5, 6]
输出: 3
解释: 
索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
同时, 3 也是第一个符合要求的中心索引。

示例 2:
输入: 
nums = [1, 2, 3]
输出: -1
解释: 
数组中不存在满足此条件的中心索引。
说明:
nums 的长度范围为 [0, 10000]。
任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 */
//public class Test_0217 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {-1,-1,-1,-1,-1,-1};
//		System.out.println(So.pivotIndex(nums));
//	}
//}
//class Solution {
//    public int pivotIndex(int[] nums) {
//    	int sum = 0;
//        for(int i=0; i<nums.length ; i++){
//        	sum += nums[i];
//        }
//        int temp = 0;
//        for(int j=0; j<nums.length ; j++){
//        	if(temp*2 + nums[j] == sum )
//        		return j;
//        	temp += nums[j];
//        }
//        return -1;
//    }
//}
/*
 744. 寻找比目标字母大的最小字母
 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。

示例:
输入:
letters = ["c", "f", "j"]
target = "a"
输出: "c"

输入:
letters = ["c", "f", "j"]
target = "c"
输出: "f"
输入:
letters = ["c", "f", "j"]
target = "d"
输出: "f"

输入:
letters = ["c", "f", "j"]
target = "g"
输出: "j"
输入:
letters = ["c", "f", "j"]
target = "j"
输出: "c"

输入:
letters = ["c", "f", "j"]
target = "k"
输出: "c"
注:
letters长度范围在[2, 10000]区间内。
letters 仅由小写字母组成，最少包含两个不同的字母。
目标字母target 是一个小写字母。
 */
public class Test_0217 {
	public static void main(String[] args) {
		Solution So = new Solution();
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		System.out.println(So.nextGreatestLetter(letters, target));
	}
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {	
        for(int i=0; i<letters.length; i++){
        	if(letters[i]> target ){
        		return letters[i];
        	}       		
        }
        return letters[0];
    }
}