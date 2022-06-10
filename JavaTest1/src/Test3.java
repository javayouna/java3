import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		사용자가 입력한 값이 60이 넘어갈 경우 
		해당 숫자는 60까지만 입력 되어야 합니다.
		60이하의 숫자 입력 경우 짝수, 홀수있니 메세지 출력 */
		
		
		
		Scanner yn = new Scanner(System.in);
		int user = yn.nextInt();

		if(user>60) {
			System.out.println("해당 숫자는 60까지만 입력되어야합니다.");
		
		}
		else {
			if(user%2==0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
		}
		
	yn.close();
	}
	

}
