package ch07.ex02.case04;

public class Shuffle {
	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + " ");
		}
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 5);
			
			int temp = nums[0];
			nums[0] = nums[n];
			nums[n] = temp;
		}
		
		System.out.println();
		for(int num: nums)
			System.out.print(num + " ");
	}
}
