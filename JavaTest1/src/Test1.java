import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("on & off 중 하나를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		String user = sc.next();
		if(user.equals("on")) {
			System.out.println("결과는 true");
		}
		else if(user.equals("off")) {
			System.out.println("결과는 false");
		}
		sc.close();
	}
	}


