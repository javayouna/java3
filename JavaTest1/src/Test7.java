import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		/*
		 * ����ڰ� �Է��� �������� �������� ǥ���ϴ� ���ù� �����ϰ� ������ �ѱ۷� ǥ��
		 */
		/*
		 * [������ ����, ��Ȳ, ���, �ʷ�]
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���.[������ ����, ��Ȳ, ���, �ʷ�]");
		String user = sc.next();

		switch (user) {
		case "����": {

			System.out.println("red");
		}
			break;
		case "��Ȳ": {

			System.out.println("orange");
		}
			break;
		case "���": {

			System.out.println("orange");
		}
			break;
		case "�׸�": {

			System.out.println("Green");
		}
			break;

		default:
			System.out.println("�ش� �ܾ�� ������ ���� �ʽ��ϴ�.");
			break;

		}
		sc.close();
	}
}
