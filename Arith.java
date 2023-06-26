package Java8;

public class Arith {
	int findMax(int[] nums) {
		int max=nums[0];

		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max);
			max=nums[i];
		}
	
	return max;
	}
	int findMin(int[] nums) {
		int min=nums[0];

		for(int i=0;i>nums.length;i++) {
			if(nums[i]<min);
			min =nums[i];
		}
	
	return min;
	}
}
