
public class Test2 {

	public static void main(String[] args) {
		
  /* ������ ���� ��� ���� ���ǹ� 
   * ���� �ϳ� �����Ͽ� �ش� ���� �Է�
   * 90�̻�(����) "��� A�Դϴ�."�Դϴ�.
   * 70~89	"��� B�Դϴ�."	
   * 50~69���� "��� C�Դϴ�"
   * �� �ܴ� �Ϲ� ����Դϴ�.
   * �� sysout �� �ѹ� */
 

	
		int a =1;
		 String msg= " " ;
		if (a>=90) {
			msg="��� A�Դϴ�.";
		}
		else if(a>=70 && a<=89) {
			msg="��� B�Դϴ�.";
		}
		else if(a>=50 && a<=69) {
			msg="��� C�Դϴ�.";
		}
		else {
			msg="�Ϲ� ����Դϴ�.";
		}
		 System.out.println(msg);
	}

}
