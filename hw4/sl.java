
public class sl extends slash{
	public int index=0;
	public int slash_min(int[] A) {
		search(A,0,A.length-1);
		return (A.length-index-2);
	}

	
	void search(int arr[], int low, int high) {
		int mid = (low + high) / 2;
		int a = arr[mid]; //lmax
		int b = arr[high]; //rmax
		if(arr[mid]<arr[mid-1]) {index=mid-1;}
		else {
		if(a>b) //slash at right half
		{search(arr, mid+1 ,high);
		}
		else //slash at left half
		{search(arr,low ,mid);}
		}
	}
	public static void main(String[] args) {
		/*long startTime = System.currentTimeMillis();
		sl test = new sl();
		int[] A= {123,757,899,985,999,1456,1666,1852,1999,2598,6326,999908,999940,999958,999986,8,45,59,88,109};
		int[] B= {3,4,5,6,7,8,9,0,1,2};
		System.out.println(B.length);
		int ans = test.slash_min(B);
		System.out.println(ans);
		System.out.println("Using Time:" + (System.currentTimeMillis() - startTime) + " ms");*/

	}

}
