
public class Method6 {

	public static void main(String[] args) {
		// Private�� ���� ��ü ���� ����2

		String userid="hong";
		String skey="a1234567";
		insert i = new insert();
		i.userid="hong";
		String result=i.checks(skey);
		System.out.println(result);	
	}
}
class insert{
	String userid=null;
	private String key="a123456"; //�ش� Ŭ�������� ����Ǵ� key��
	
	public String checks(String bb) {
		String msg=null;
		if (key.equals("a1234567")) { 
			//�ش� Ű��(private)�� �ܺ� class���� �Ѿ���� �μ����� ��
			if(userid.equals("hong")) {//���̵� Ȯ��
				msg="�����͸� Ȯ�� �߿� �ֽ��ϴ�.";
			}
			else {
				msg="�ش� �����Ͱ��� Ȯ�� �������մϴ�.";
			}
		}
		else {//�ܺ� class���� �ùٸ� Ű���� ���� ���� ���� ��� 
			msg="error";
		}
		return msg;//���� ����� ���� return���� ȸ����
	}
}