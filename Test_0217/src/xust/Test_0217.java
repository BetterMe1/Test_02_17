package xust;

import java.util.ArrayList;
import java.util.List;


/*
724. Ѱ���������������
����һ���������͵����� nums�����дһ���ܹ��������顰�����������ķ�����
���������������������������ģ����������������������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�
������鲻����������������ô����Ӧ�÷��� -1����������ж��������������ô����Ӧ�÷��������ߵ���һ����

ʾ�� 1:
����: 
nums = [1, 7, 3, 6, 5, 6]
���: 3
����: 
����3 (nums[3] = 6) �������֮��(1 + 7 + 3 = 11)�����Ҳ���֮��(5 + 6 = 11)��ȡ�
ͬʱ, 3 Ҳ�ǵ�һ������Ҫ�������������

ʾ�� 2:
����: 
nums = [1, 2, 3]
���: -1
����: 
�����в��������������������������
˵��:
nums �ĳ��ȷ�ΧΪ [0, 10000]��
�κ�һ�� nums[i] ������һ����Χ�� [-1000, 1000]��������
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
 744. Ѱ�ұ�Ŀ����ĸ�����С��ĸ
 ����һ��ֻ����Сд��ĸ����������letters ��һ��Ŀ����ĸ target��Ѱ���������������Ŀ����ĸ�����С��ĸ��
��������ĸ��˳����ѭ���ġ��ٸ����ӣ����Ŀ����ĸtarget = 'z' ������������Ϊ letters = ['a', 'b']����𰸷��� 'a'��

ʾ��:
����:
letters = ["c", "f", "j"]
target = "a"
���: "c"

����:
letters = ["c", "f", "j"]
target = "c"
���: "f"
����:
letters = ["c", "f", "j"]
target = "d"
���: "f"

����:
letters = ["c", "f", "j"]
target = "g"
���: "j"
����:
letters = ["c", "f", "j"]
target = "j"
���: "c"

����:
letters = ["c", "f", "j"]
target = "k"
���: "c"
ע:
letters���ȷ�Χ��[2, 10000]�����ڡ�
letters ����Сд��ĸ��ɣ����ٰ���������ͬ����ĸ��
Ŀ����ĸtarget ��һ��Сд��ĸ��
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