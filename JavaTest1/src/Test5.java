
public class Test5 {

	public static void main(String[] args) {
		/*1~100���� ���� ���ϼ���.
		 *  �� 4000�̻� �Ѿ�� �ݺ����� ���� �ؾ� �ϸ� ������� ��� �Ǿ���մϴ�.*/
		
		
		int sum =0;
		for (int i=1;i<=100;i++) {
			sum+=i;
			if(sum>4000-i) {
			System.out.println(sum);
			break;
			
				//System.out.println(sum);
			}
		}
		

	}

}
