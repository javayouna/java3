import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("on & off �� �ϳ��� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		
		String user = sc.next();
		if(user.equals("on")) {
			System.out.println("����� true");
		}
		else if(user.equals("off")) {
			System.out.println("����� false");
		}
		sc.close();
	}
	}


