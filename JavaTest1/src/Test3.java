import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		����ڰ� �Է��� ���� 60�� �Ѿ ��� 
		�ش� ���ڴ� 60������ �Է� �Ǿ�� �մϴ�.
		60������ ���� �Է� ��� ¦��, Ȧ���ִ� �޼��� ��� */
		
		
		
		Scanner yn = new Scanner(System.in);
		int user = yn.nextInt();

		if(user>60) {
			System.out.println("�ش� ���ڴ� 60������ �ԷµǾ���մϴ�.");
		
		}
		else {
			if(user%2==0) {
				System.out.println("¦��");
			}
			else {
				System.out.println("Ȧ��");
			}
		}
		
	yn.close();
	}
	

}
