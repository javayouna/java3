import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * [���� ���빮��] �迭�� �����ؾ� �� �����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ����Դϴ�. �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���,
		 * Ȱ��ȭ�ϴ�(Y,N)�����մϴ�. �ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� �� ���ο���
		 * ��µǵ��� �մϴ�. [���] [���Ϲ��, ����������, ���ڽ�,�̺�Ʈ,�߼�] ��, private �� return�� Ȱ���Ͽ� ���α׷���
		 * �ۼ��մϴ�.
		 */

		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
		
		
	}
}
/* �ݺ���?? 7����, Y�� �����(���ǹ� if)*/
class menus {
	private String mdata[][];
	private String rdata[];
	String a;
	public menus() {
		String ms[][] = { { "���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };
	
		this.mdata =ms;
		//System.out.println(this.mdata[0][0]); // Arrays ��� �� �� ! Arrays.toString(this.mdata)); �̷����ϸ� �̻��ѵ����ͳ����µ�..! 2�����̴ϱ�
		//�ùٸ� ���� Arrays.toString(this.mdata[1][1])) �̰� ��Ģ�̶� �ܿ����� ���� �ε����� ���� ���� ���� sysout ��ü ����� Arrays
		redata();
	}
	public void redata() {
		//
		//System.out.println(Arrays.toString(this.mdata[0]));
		int ea= this.mdata[0].length;
		String ww[]= new String[ea];
		int w=0;
		int ct=0;
		do {
			if(this.mdata[1][w].equals("Y")){
				ww[ct]=this.mdata[0][w];
				ct++;
			}
			w++;
	
		}while(w<ea);
	

		this.rdata=ww;
		
	}
	public String[] get() {
		return this.rdata;
	}

}




/* class aa{
 * int a;  -> field �ʵ� �� �� ��, ���� ����
 * String b;  ->
 * public aaa(){ -> constructor
 * }
 *	
 *	public void
 *	public static void
 *	public String abc
 *	->method �޼ҵ�!�� ���� �� ������
 */



/*
 * ���� ������ �Ѱ�
 * 
 * 		menus yn = new menus();
		String uu[]=yn.menus();
		System.out.println(Arrays.toString(uu));
}
}
 * 
 * class menus{
 *  private String mu[];
 *  public String[] menus() 
 * { String ms[][] = {
 * {"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"}, 
 * {"Y","Y","N","Y","Y","N","Y"}
 * };
 *  mu=new String[5]; int j=0;
 *   for(int i=0;i<ms[0].length;i++) {
 * if(ms[1][i].equals("Y"))
 *  { mu[j]=ms[0][i]; j++;
 * 
 * } } return this.mu; } }
 */
