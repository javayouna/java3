
public class imsi2 { //set�� �����̺� �����ϱ�

	public static void main(String[] args) {
	    Lock lock = new Lock("123!@#");
	    
	    /* 1. ���͸� ȣ���Ͽ�, ��й�ȣ�� �����Ͻÿ�. */
	    lock.setPassword("654#@!");
	    
	    // ��ü ���� ���
	    System.out.println(lock.toString());

	}

}
class Lock{
	private String password;

	public Lock(String p) {
		password=p;
	}
	public String toString() {
		return String.format("Lock {password, %s}",password); //String.format() ���ϵǴ� ���ڿ��� ���¸� �����ϴ� �޼ҵ�
	}
	public void setPassword(String pw) {
		password=pw;
	}
}