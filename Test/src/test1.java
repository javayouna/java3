
public class test1 {

	public static void main(String[] args) {
	
		bb b = new bb();
		b.cname ="홍길동"; //여기서 바꿀 수 있음 
		String aws = b.bbb();
		System.out.println(aws);
	}

	
	
}
class bb{
	private String bname; //인수값을 받든, 반복문을 받든, 받아서 처리하는 거고 로그인 안하면 게시판 못봐!
	public String cname; //메소드를 통과 안 하고 바로 들어감 로그인 안해도 공지사항 볼 수 있엉!!
	
	public void aaa(String user) {
		if(user=="홍길동") {
			this.cname="이미 가입 되어있습니다.";
		}
		else {
			this.cname="가입할 수 있는 고객입니다.";
		}
			
	}
	
	public String bbb() {
		return this.cname;
	}


}

