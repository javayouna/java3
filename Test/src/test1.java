
public class test1 {

	public static void main(String[] args) {
	
		bb b = new bb();
		b.cname ="ȫ�浿"; //���⼭ �ٲ� �� ���� 
		String aws = b.bbb();
		System.out.println(aws);
	}

	
	
}
class bb{
	private String bname; //�μ����� �޵�, �ݺ����� �޵�, �޾Ƽ� ó���ϴ� �Ű� �α��� ���ϸ� �Խ��� ����!
	public String cname; //�޼ҵ带 ��� �� �ϰ� �ٷ� �� �α��� ���ص� �������� �� �� �־�!!
	
	public void aaa(String user) {
		if(user=="ȫ�浿") {
			this.cname="�̹� ���� �Ǿ��ֽ��ϴ�.";
		}
		else {
			this.cname="������ �� �ִ� ���Դϴ�.";
		}
			
	}
	
	public String bbb() {
		return this.cname;
	}


}

