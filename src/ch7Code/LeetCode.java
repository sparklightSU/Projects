package ch7Code;

public class LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,2,8};
		int[] ans = twoSum(arr, 9);
		for(int i = 0; i < 2; i++) {
			System.out.println(ans[i]);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
        }
        return newArr;
    }
}
