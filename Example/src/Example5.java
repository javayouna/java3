import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		/*
		 * ���빮�� extends ����ؾ� �� extends�� ����Ͽ� ���� ��� �ڵ带 �ۼ��ϼ���. ���� �� ���� �Է��մϴ�. �� ���� ���ڸ�
		 * Ȯ���Ͽ� ������ ���� üũ�մϴ�. ù��° ���ڰ� �� ��° ���ں��� ���� ��� ù��° ���ڰ� �� ��° ���ں��� Ŭ ��� ù��° ���ڰ� ��
		 * ��° ���ڶ� ���� ���
		 * 
		 * ù��° ���ڰ� ���� ���:�ش� �� ���� ���� ��ģ ����� ��� �ι�° ���ڰ� ���� ���:�ش� �� ���� ���� ��ģ ����� ��� ù��°��
		 * �ι�° ���ڰ� ���� ���:"�ش� ���� �����ϴ�."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù�� �� ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�ι� �� ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		cba yn = new cba();
		yn.ccc(a, b);
		
		yn.ddd();
		sc.close();
		System.exit(0);
	}

}

class abc {
	protected int i;
	protected int ii;
	protected int sum;

	public void ccc(int i, int ii) {
		this.i = i;
		this.ii = ii;
	}
}

class cba extends abc {
	public void ddd() { //�̰� setter
		if (i < ii) {
			this.sum = i + ii;
			System.out.println(this.sum);
		}
		else if (i > ii){
			do {
				this.sum += ii; //
				ii++;
			} while (i >= ii);
			System.out.println(this.sum);
		} 
		else {
			System.out.println("�ش� ���� �����ϴ�.");
		}
	}
}
