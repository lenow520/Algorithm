public class MD extends MaxDifference{
	public  int max_d(int[] list) {
		int max=0,min=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>max) {max=list[i];}
			if(list[i]<min) {min=list[i];}
		}
		return (max-min);
	}
	
	/*public static void main(String[] args) {
	MD test = new MD();
	int[] A = {1,0,3,-3,6,-7,49,-78,65,13,5,-35} ;
	int i = test.max_d(A);
	System.out.println(i);
	}*/
}
