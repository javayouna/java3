
public class imsi2 { //set로 프라이빗 변경하기

	public static void main(String[] args) {
	    Lock lock = new Lock("123!@#");
	    
	    /* 1. 세터를 호출하여, 비밀번호를 변경하시오. */
	    lock.setPassword("654#@!");
	    
	    // 객체 정보 출력
	    System.out.println(lock.toString());

	}

}
class Lock{
	private String password;

	public Lock(String p) {
		password=p;
	}
	public String toString() {
		return String.format("Lock {password, %s}",password); //String.format() 리턴되는 문자열의 형태를 지정하는 메소드
	}
	public void setPassword(String pw) {
		password=pw;
	}
}