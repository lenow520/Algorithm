import java.util.Arrays;

public class ThreeSum4106056012 extends ThreeSum {
	public int T_sum(int[] arr) {
		Arrays.sort(arr);
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			sum += arr[i]+arr[j];
			if(Arrays.binarySearch(arr,-sum)>j) {count++;}
			sum = 0;
			}
			}
		
				return count;
	}

	public static void main(String[] args) {
		ThreeSum4106056012 test = new ThreeSum4106056012();
		int[] A = {1,0,3,-3,6,-7} ;
		int[] B = {1,2,-3} ;
		int i = test.T_sum(A);
		System.out.println(i);
		i = test.T_sum(B);
		System.out.println(i);
		
	}


}
