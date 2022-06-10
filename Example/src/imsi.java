import java.util.Scanner;

public class imsi {

	public static void main(String[] args) {
		/*응용문제
		 * 더블 반복문을 이용하세요~
		 * (while~do~while)
		 	* 1+1=2 2+1=3 2+2+4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 		*/
					
			int w=1;
			int total=0;
			while(w<=4) {
				int ww=1;
				do {
					total=(w+ww);
					System.out.println(w+"+"+ww+"="+(w+ww));
					ww++;
				}while(ww<=w);
				
				w++;
			}

		
		
	}
}

		
	


