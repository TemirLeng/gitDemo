import java.util.Arrays;
public class rotateProject {
	public static void main(String[] args) {
		int[][] nums1 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		//System.out.println(rotate90Right(nums1)[2][0]);
	    System.out.println(Arrays.deepToString(nums1));
		System.out.println(Arrays.deepToString( rotate90Right(nums1)   ));
		
	}
	// output: [
	// [15,13, 2, 5],
	// [14, 3, 4, 1],
	// [12, 6, 8, 9],
	// [16, 7,10,11]
//]
	// 5 => 0 , 0 ==== 0,3      //   2   -----  1 ,0 ----   0,2;		//  13 ----- 2,0 ----- 0,1;		///// 15 ---- 3,0 --- 0,0;
	// 1 => 0,1 ==== 1,3         // 4 ------ 1,1 ----- 1,2;				//  3 ---   2,1 ---   1,1;				///// 14 -----3,1 ----1,0
	// 9 => 0,2 ==== 2,3        //   8 ----- 1,2------   2,2;			// 6-      2,2  ---  2					 ///// 12 -----3,2 ----2,0;
	// 11 === 0,3 ==== 3,3;    //  10 ------ 1,3 ---- 3,2;				// 7---- 2,3 ---- 3,1;					///// 16 ----- 3,3----3,0;
	public static int[][] rotate90Right(int nums[][]) {
		int[][] returnArray = new int[nums.length][nums.length];
		int arrayIndex = 0;
         int numDifference =1;
		for (int i = 0; i < nums.length; i++) {

			returnArray[i][nums.length - numDifference ] = nums[arrayIndex][i];
		}
		arrayIndex++;
		numDifference++;
		for (int i = 0; i < nums.length; i++) {
			returnArray[i][nums.length - numDifference] = nums[arrayIndex][i];

		}
		arrayIndex++;
		numDifference++;
		for (int i = 0; i < nums.length; i++) {
			returnArray[i][nums.length - numDifference] = nums[arrayIndex][i];
		}
		arrayIndex++;
		numDifference++;
		for (int i = 0; i < nums.length; i++) {
			returnArray[i][nums.length - numDifference] = nums[arrayIndex][i];
		}
		return returnArray;
	}

}
