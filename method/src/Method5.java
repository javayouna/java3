
public class Method5 {

	public static void main(String[] args) {
	//this 
		
		cdb c = new cdb();
		/*c.d1="ȫ�浿";
		c.data2();
		c.d3="�̼���";
		c.data1();
		c.d3="������";
		System.out.println(c.data3());
	*/
		
		//c.d2="������"; private�� ������ ��ü�� main class���� �ε� ����..!
		c.data2("������");
		String result=c.data3();
		System.out.println(result);
		c.d1="������"
;		cdb.data1();
	}
	

}
class cdb{
	String d1=null; /*void, �ڷ��� �޼ҵ� �ε� ���� */
	private String d2=null;
	public static String d3;/*�� ��밡��*/
	
	public static void data1() { /*static �ڷ��� �ܿ��� �ε� �Ұ�����*/
		//System.out.println(d3);
		//System.out.println(this.d2);
		String d1 ="ȫ�浿";
		System.out.println(d1); //������ ������ �������� ȫ�浿�� ��� why? String d1=ȫ�浿 �� �������ڳ� 
	}
	
	public void data2(String user) {
		//System.out.println(d1);
		this.d2=user;
		System.out.println(this.d2);
	}
	public String data3() {
		String a=this.d2;
		return a;
	}
	
}

