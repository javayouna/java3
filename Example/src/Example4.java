
public class Example4 {

	public static void main(String[] args) {

		/*
		 * ���빮�� �� ���� ���� �ܺ� Ŭ������ �����ϴ�. �ش� Ŭ�������� �� ���� ���� ����ϰԵ˴ϴ�. ������� ������ �����ϴ�. 3,10�� ������
		 * �Ǹ� �ΰ��� ���� ���� ���մϴ�. ������ �ܺ� Ŭ�������� �ش� ��� ���� ����ϴµ� �� ���� �� ���� ¦��, Ȧ�� ������ ����ϴ�
		 * extends�� �����ϼ���
		 */
		text2 yn = new text2();
		yn.ii(3, 10); // �ھ�� �ؿ� ��� ���� �ٲ�� ���� �ٲ� �Ϳ�~
		yn.huhu(); // �ھ��!!

	}

}

class text {

	protected int sum;

	public void ii(int a, int aa) {
		this.sum = a + aa;

	}
}

class text2 extends text {
	public void huhu() {
		if (this.sum % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}