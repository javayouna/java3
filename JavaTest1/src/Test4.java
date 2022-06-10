import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 구구단 숫자를 하나 입력합니다. 4를 입력하면 4단 출력 사용자가 음수값을 입력할 경우 음수값은 구구단을 이용할 수없습니다. 메세지 반복문
		 * do~while문
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력해주세요.");

		int user = sc.nextInt();

		if (user <= 0) {
			System.out.println("음수값은 구구단은 이용할 수 없습니다.");
		} 
		else {
			int w = 0;
			int sum = 0;
			do {
				sum = user * w;
				w++;
				System.out.println(user + " * " + w + " = " + (user * w));
			} while (w < 9);
			if (user < 0) {
				System.out.println("음수값은 구구단은 이용할 수 없습니다.");
			}

		}
		sc.close();
	}
}
