import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		[up&down ����]

	A��Ʈ:PC ����..��ĳ�� �̿� (5)�������� 
	B��Ʈ:PC ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��

pc�� ���ڸ� �ϳ� ����? ��Ʈ random 1~10
�� ��ȸ�� x�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
���࿡ pc�� ���� 7�� ����
-pc:7 ����� :2 -> ��� up
�� ��ȸ�� x�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
pc:7 �����:4  ->��� up
�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
pc:7 �����:7 ->�����Դϴ�. ��� ���μ����� ���� */

		int rotto = (int)(Math.random()*10)+1;
		Scanner sc = new Scanner(System.in);
		int e=5;
		int user=0;
		while(e>=1) {
			System.out.println("�� ��ȸ�� "+e+"�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�");
			user=sc.nextInt();
			e--;
			Example2 ac = new Example2();
			ac.main2(rotto,user);
		}
		if(e==0) {
			System.out.println("~~��������~~");
		}
	
		sc.close();
	}

}
