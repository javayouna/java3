
public class Example3 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();
		ih2.it("ȫ�浿", "aaa5");
		ih2.print();
		//���� �ʵ�-�г�-������Ʈ-
		//String a = it2.print(); // public void print()�� ������ ���� �� �� ! �䷸�� �� �� ����
	
	}

}

class ingerit1 {
	private String nm; // private Ŭ���� ���ο�����..! private�� �ڽ�Ŭ�������� ���� ������ ���� �ϳ� ���������� //inherit1 �κи� �۵�
	protected String pw; // �ܺο��� ������ �������� �������� ����� �� ���� //inherit1,inherit2���� ��� �ۿ� �ܺο��� �ε� ���� 
	static String aa; //public String aa;�� ��� ��  //private�� ���� �κ� inherit2������ ����� �� �ֵ��� �ϱ� ����

	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		aa = this.nm;

		// String aa =this.nm; <- void �ȿ����� ��� ��

	}

}

class inherit2 extends ingerit1 {
	public void print() {
		System.out.println(this.aa + "" + this.pw);

	}

}