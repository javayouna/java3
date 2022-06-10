import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 생ㄱ상이 영문으로 표기하는 선택문 번역하고 색상을 한글로 표기
		 */
		/*
		 * [적용대상 빨강, 주황, 노랑, 초록]
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("번역할 색상을 입력하세요.[적용대상 빨강, 주황, 노랑, 초록]");
		String user = sc.next();

		switch (user) {
		case "빨강": {

			System.out.println("red");
		}
			break;
		case "주황": {

			System.out.println("orange");
		}
			break;
		case "노랑": {

			System.out.println("orange");
		}
			break;
		case "그린": {

			System.out.println("Green");
		}
			break;

		default:
			System.out.println("해당 단어는 번역이 되지 않습니다.");
			break;

		}
		sc.close();
	}
}
