import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * ������ ���ڸ� �ϳ� �Է��մϴ�. 4�� �Է��ϸ� 4�� ��� ����ڰ� �������� �Է��� ��� �������� �������� �̿��� �������ϴ�. �޼��� �ݺ���
		 * do~while��
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է����ּ���.");

		int user = sc.nextInt();

		if (user <= 0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
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
				System.out.println("�������� �������� �̿��� �� �����ϴ�.");
			}

		}
		sc.close();
	}
}
