
public class Method12 {

	public static void main(String[] args) {
		//extends����� �ڽ� class �ε��ϸ�
		//�ڵ����� �θ� class�� �Բ� ��� ������!
		bbox2 bx = new bbox2();
		bx.b2("�̼���"); //�������ٰ� ������ �� ����
		System.out.println(bx.abc());
		
		
		
		

	}

}
class bbox{ //�⺻ �ܺ� class1 main���� �ʿ��� ����üũ
	protected String user_info; //��protected�� ���� ���� ���� ������ 
	private String user_pw;
	public String user_rpw;
	public bbox() {
		//this.user_info =�� "ȫ�浿"; ���࿡ ���� ȫ�浿(��)�� ������!
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd", "sdfd");	
	}
	public String abc() {
		String email ="hong@nate.com";
		return email;
	}
}


class bbox2 extends bbox{ // bbox��� ������ bbox2�� �����ϰԵ� ��, bbox�߿��� private���� ���õ� ���� �������� ����
	public void b2(String nm){ //�ڿ��⿡�ٰ� string ������ �־ 
		//�ش� ���� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ�� �� user_info�� �����ϴ�����
		this.user_info=nm; //����� ���ɾ�!
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
	}
}