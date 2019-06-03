import java.util.Arrays;

public class rotate180 {
	public static void main(String[] args) {

		int[][] nums1 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		//System.out.println(rotate180(nums1)[3][3]);
		 System.out.println(Arrays.deepToString(nums1));
		 System.out.println(Arrays.deepToString( rotate180(nums1) ));

	} // output: [
	// input [ // [16,12,14,15],
	// [ 5,1,9,11 ] // [7,6,3,13],
	// [ 2,4,8,10 ] //[ 10,8,4,2],
	// [ 13,3,6,7 ] // [11,9,1,5]
	// [ 15,14,12, 16 ]

	// firstarray input output // input(nums ) output(returnArray) // input(nums)
	// output // input output
	// 5 => 0 , 0 ==== 3,3 // 2 -- 1,0 --- 2,3 // 13 -- 2,0 1,3 //15 -- 3,0 -- 0,3
	// 1 => 0,1 ==== 3,2 // 4 -- 1,1---- 2,2 // 3-- 2,1 1,2 // 14 3,1 -- 0,2
	// 9 => 0,2 ==== 3 ,1 // 8 -- 1,2--- 2,1 // 6 -- 2,2 1,1 // 12 3,2 -- 0,1
	// 11 === 0,3 ==== 3,0 // 10 - 1--3 ---- 2,0 // 7 -- 2,3 1,0 // 16 3,3 -- 0,0

	public static int[][] rotate180(int[][] nums) {
		int[][] returnArray = new int[nums.length][nums.length];
		int numsFirst = 0;
		int returnArrayfirst = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];

		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];

		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];
		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];
		}

		return returnArray;
	}

}
