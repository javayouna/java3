
public class imsi {

	public static void main(String[] args) {
	    Person park = new Person("ȫ��", "010-1234-5678");

	    
	    /* 1. ���͸� ȣ���Ͽ� �ʵ尪�� �����ÿ�. */
	    System.out.printf("�� ��: %s\n", park.getName());
	    System.out.printf("����ó: %s\n", park.getPhoneNumber());
	  }
	} 

	class Person {
	  // �ʵ�
	  private String name;
	  private String phoneNumber;
	
	
	public Person(String n,String p) {
		name=n;
		phoneNumber=p;		
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
		
	}
	


