
public class Method14 {

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("�̼���");
	}
}


class Mbc{
	public Mbc() { //�Ϲ� construct
		System.out.println("����1");
		test();
	}
	public Mbc(String user) { // �μ����� �ִ� construct
		System.out.println(user);	
		test(user);
	}
	public Mbc(int user2) { // construct���� �μ����� �ڷ������� ���е�
		System.out.println(user2);	
		//test(user2);
	}
	public void test () {  ///�μ����� ���� method
		System.out.println("�޼ҵ�");
		total();
	}
	public void test (String user) { //�μ����� �ִ� method
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("�ý��� ����");
	}
}
