
public class test4 {

	public static void main(String[] args) {
		int array[] = {5,3,1,10,6,12};
		 
	
		for(int i=0;i<array.length;i++) {
			 if(array[i]>=7 && array[i]%3==0) {
			//	 System.out.println(array[i]);
			 }
	}

		
		
		int array2[] = {55,44,33,22,11,10,9,8,7,6,5,4,3,2,1};
		
		int e=0;
		int ea=array2.length;
		
		while(e<ea) {
			
			if(array2[e]%2==0 && array2[e]<10) {
				System.out.println(array2[e]);
			}
			e++;
			
		}
		
		
}
}