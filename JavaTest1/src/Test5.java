
public class Test5 {

	public static void main(String[] args) {
		/*1~100까지 합을 구하세요.
		 *  단 4000이상 넘어가면 반복문은 정지 해야 하며 결과값이 출력 되어야합니다.*/
		
		
		int sum =0;
		for (int i=1;i<=100;i++) {
			sum+=i;
			if(sum>4000-i) {
			System.out.println(sum);
			break;
			
				//System.out.println(sum);
			}
		}
		

	}

}
