import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*[���빮��]
		 * ���� ���α׷��Ӱ� �ش� DB �� ��,
		 * Ȧ������ ���� �� ������ �ް��� �մϴ�.
		 * �ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ��ϼ���.
		 */

		odbc ap = new odbc();	
		//System.out.println(ap.age[i]);
		int gugu=ap.aaa(); //odbc od = new odbc();  
		System.out.println(gugu); //(od.aaa());
	}

}

class odbc{

	private int odata[]; //�迭���� ������� �ʵ��� ��� 
	private int count=0; //Ȧ�� �� ��� +1�� ���� �ϱ� ���� �ʵ� ���� ��
	
	public odbc() {
		
		int odata2[]= {15,22,17,14,32,35,19,33};
		this.odata=odata2;
	
	}
	
	
	public int aaa() { //main���� ���� �ִ� apap()<-���⿡ ���ڰ� ������ �ȵ� 
		int w=0;
		int ea=this.odata.length;
		while(w<ea) {
			if(this.odata[w]%2==1) {
				this.count++; //Ȧ���̸� +1�� ����
			}
			w++;
		}
		return this.count; // ���� ���� return��Ŵ return���� this �ٿ��ֱ�.
	
	}
}