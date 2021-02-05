public class PCL4106056012 extends PCL {
	public boolean checkPCL(int[][] array) {
		double [] slope = new double[array.length-1];
		int count;
		for(int i=0;i<array.length-2;i++) {
			count=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i][0] == array[j][0]){slope[count]=0;}
				else if(array[i][1] == array[j][1]){slope[count]=6845298765435202.15628775203456 ;}
				else{slope[count] =((double)(array[i][0] - array[j][0])/(array[i][1] - array[j][1]));}
				count++;
				}
		qs(slope,0,count-1); 
		for(int k=0;k<count-1;k++) {
			if(slope[k]==slope[k+1]) {return true;}
		}
		}
		return false;
		}
		
	int partition(double arr[], int low, int high) 
    { 
		double temp;
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
        	if (arr[j] < arr[high]) 
            { 
                i++; 
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
       
        temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 

    void qs(double arr[], int low, int high) 
    { 
    	int p;
        if (low < high) 
        { 
            p = partition(arr, low, high); 
            qs(arr, low, p-1); 
            qs(arr, p+1, high); 
        } 
    } 
  
		public static void main(String[] args){
			/*long startTime = System.currentTimeMillis();
			PCL41060560123 test = new PCL41060560123();
			int[][] A={{20091142,37662805},{-39149449,-59782383},{-99264459,-74860209},{5,5},{-88348788,-79715802},{12,12},{-96494930,-83479800},{4,255},{77,3},{88769935,42778540},{1,2},{6,59},{37,24},{-79049070,-2286184},{73983425,77794414},{14353195,90191991},{-86307356,-29132177},{16271815,17627275},{90517107,-35522175},{-54903624,-29619642}};
			boolean ans=test.checkPCL(A);
			System.out.println(ans);
			System.out.println("Using Time:" + (System.currentTimeMillis() - startTime) + " ms");
			*/}
		
		}	