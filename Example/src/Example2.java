
public class Example2 {


		
		
	private int rotto2;

	
	public void main2(int rotto2,int user2) {
		 
		if (user2 > rotto2) {
		System.out.println("��Down��");
		
		}
		
		else if(user2<rotto2) {
			System.out.println("��UP��");
			
		}
		else if(user2==rotto2) {
			System.out.println("�����Դϴ�.");
			System.exit(0); //����ٰ����� ��� ������� Example1 ���� ����
		}

		}
		
}

//private int val1; //pc
//private int val2; //user
//private String msg; //����޼���
//
//
//public void randomck(int pc, int user) { //setter(�μ����� ����)
//	this.val1=pc;
//	this.val2=user;
//	if(this.val1 > this.val2){
//		this.msg ="UP �Դϴ�";
//		
//	
//	}
//	else if(this.val1 < this.val2) {
//		this.msg ="DOWN �Դϴ�";
//		
//}
//	else {
//		this.msg ="�����Դϴ�.";
//	}
//	
//}	
//public String result() {//getter(�μ���x) return ! �ڷ������� �������� 
//	return this.msg;
//}
//	
//}	
