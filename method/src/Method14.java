
public class Method14 {

	public static void main(String[] args) {
		Mbc m = new Mbc();
		Mbc m2 = new Mbc("이순신");
	}
}


class Mbc{
	public Mbc() { //일반 construct
		System.out.println("구조1");
		test();
	}
	public Mbc(String user) { // 인수값이 있는 construct
		System.out.println(user);	
		test(user);
	}
	public Mbc(int user2) { // construct에서 인수값은 자료형으로 구분됨
		System.out.println(user2);	
		//test(user2);
	}
	public void test () {  ///인수값이 없는 method
		System.out.println("메소드");
		total();
	}
	public void test (String user) { //인수값이 있는 method
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("시스템 종료");
	}
}
