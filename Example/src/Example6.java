import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 ���빮�� ��ǰ������ 42000�� �Դϴ�.
		 ����ڰ� �ش� ��ǰ�� ������ �Է��ϰ� �˴ϴ�.
		 �ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ� ���� ���� �ݾ���
		 ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
		 ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�. 
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� �Դϴ�.
		 ������� ���� main method���� ����մϴ�.
		 */
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. �ִ� 5");
		int uu = sc.nextInt();
		b bx = new b();
		bx.b2(uu);
		System.out.println(bx.sum);
	}

}

class a {
	protected int user; 
	protected int sum;
	public a() {
		this.user = 42000;

	}
}

class b extends a {
	public void b2(int mm) {
		sum = this.user * mm;
		
	}
}

	