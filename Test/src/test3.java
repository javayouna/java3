
public class test3 {

	public static void main(String[] args) {
		
		String a ="ȫ�浿";
		String b ="";
		String c ="hong@email.com";
		//&&������ ������ ��δ� �¾ƾ� �ϴ� ���  
		if( (a=="ȫ�浿" && b=="hong") || (a=="ȫ�浿" && c=="hong@email.com")) { //���̵�� �н������ ������ ()�̷��� ��Ʈ�� �ǰ� 
			//System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�.");
		}
		else {
			//System.out.println("�ش� ����� ������ Ȯ�� �� �� �����ϴ�.");
		}
		// ||������ �ϳ��� ������ ����Ǵ� �κ� 
		if(a=="ȫ�浿"||b=="hong"||c=="hong@email.com") {
			System.out.println("�ش� ����� ������ Ȯ�� �Ͽ����ϴ�.");;
		}
		else {
			System.out.println("�ش� ����� ������ Ȯ�� �� �� �����ϴ�.");
		}
		
		
		int no = 24;
		if(no%2==0 && no%3==0) { // &&�� ������ ��� �¾ƾ� ������ �Ǵ� �� 
			System.out.println("2�� ��� �� 3�� ��� ��� ���մϴ�.");
		}
		
		else {
			System.out.println("�ش� ���� �����տ� ���� ���� �ʽ��ϴ�.");
		}
	
		if(a=="�̼���") {
			if(b=="lee") {
				if(c=="hong@email.net") {
					System.out.println("ȸ�� ������ Ȯ�ε�");
				}
			}
		}
		
		
		
	}

}
