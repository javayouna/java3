public class Method3 {

	public static void main(String[] args) {

		/*
		 * [���빮��] �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�. ���� ����� �޾Ƽ� ����� ����ϼ���. [���] 157, 45 157*45
		 * ���� ����� ���
		 */

		math2 ma = new math2();
		int r = ma.m(5);
		System.out.println(r);
		
		/*
		 * [���빮��] ���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰԵ˴ϴ�. �ش� �޼ҵ忡���� ������ ���� ó���մϴ�. ���� 3�� �����ϸ�
		 * 3*1~3*9������ ��� ��� ���� ���Ͽ� sysout���� ��µǵ��� �Ͻʽÿ�.
		 */
		String ck=ma.mb("hong");
			System.out.println(ck);
	}
}

class math2 {

	public int m(int a) {
		int c = 0;
		for (int b = 1; b < 10; b++) {

			c += a * b;

		}
		return c;// �ݺ��� �ȿ��� return������ �ȵ�
					// ��! ���ǹ��̶� ���� return �ȵ�
	}

	public String mb(String mid) {
		String msg="";
	
		if(mid.equals("hong")) {
		 msg="ok";
	}
	else{
		msg="cancel";
	}
		return msg;/*�ش� �޼ҵ忡 ���� ���� �� ���ǿ� �´� ����
		 �����ؼ� �������� ���� return��Ŵ*/

	// public void m2() {
	// int z = m(100, 200); // ���� Ŭ�����������ϱ� m�� ��
	// System.out.println(z);

}
}
