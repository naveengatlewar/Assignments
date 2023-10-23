package arrayshuffle;

public class arrayshuffle {
	
	public int[] shuffle(int[] nums, int n) {
		int len = 2*n;
		
		int[] ans = new int[len];
		int x=0, y=n;
		int a=0;
		
		while(a<len) {
			ans[a++] = nums[x++];
			ans[a++] = nums[y++];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		arrayshuffle shuffler = new arrayshuffle();
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int n = nums.length /2;
		
		int[] shuffledArray = shuffler.shuffle(nums,  n);
		
		for(int num : shuffledArray) {
			System.out.print(num + " ");
		}
		

	}

}
