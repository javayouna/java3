
public class Method13 {

	public static void main(String[] args) {
	//extends : inherit(���) 
	
	/*
	 * ���� �θ� Ŭ���� Construct �κ� ()�� �μ��� �����ϸ� 
	 * �ڽ� Ŭ�������� �ε带 ���ϴ� ��Ȳ�� �߻���
	 * ��, �ڽ� Ŭ�������� �μ����� �����Ͽ� Construct�� ��� �� ���� ����..��0��
	 */
		mth1 m1 =new mth1();
		mth2 m2 =new mth2(50);	

	}
}

class mth1{
	public int no;
	public mth1() {//���� extends mth2�� ����Ϸ��� �ϸ�..! mth1 public���ٰ� ()�μ� �� ������ ��� �ȵ�
		this.no=20;
		System.out.println("mth1");
		
		
	}
}
class mth2 extends mth1{
	public mth2(int z) {  //�ڽĿ��� �־�� ��!
		this.no=50;
		System.out.println("mth2");
		System.out.println(this.no);
		
	}
	
	
	
}