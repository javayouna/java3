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
		System.out.println("��ǰ ������ �Է��ϼ���. �ִ� 5��");
		int user = sc.nextInt();
		
		bb yn = new bb();
		yn.ccc(user);
		System.out.println();
		sc.close();
	}	
}

class aa {
	private int cost=42000;

	public void ccc(int i) {
		if(i<6) {
			
		}
	
}


}

class bb extends aa { 
	public int sum(int a, int ab){
		this.cost=a;
		
		
		return.sum*cost;
	}
	
}