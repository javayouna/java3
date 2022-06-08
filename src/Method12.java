
public class Method12 {

	public static void main(String[] args) {
		//extends사용한 자식 class 로드하면
		//자동으로 부모 class도 함께 사용 가능함!
		bbox2 bx = new bbox2();
		bx.b2("이순신"); //★위에다가 선언할 수 있음
		System.out.println(bx.abc());
		
		
		
		

	}

}
class bbox{ //기본 외부 class1 main에서 필요한 사항체크
	protected String user_info; //★protected은 같은 형태 공유 가능함 
	private String user_pw;
	public String user_rpw;
	public bbox() {
		//this.user_info =★ "홍길동"; 만약에 여기 홍길동(값)이 없으면!
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd", "sdfd");	
	}
	public String abc() {
		String email ="hong@nate.com";
		return email;
	}
}


class bbox2 extends bbox{ // bbox모든 정보를 bbox2와 공유하게됨 단, bbox중에서 private으로 셋팅된 값은 공유하지 않음
	public void b2(String nm){ //★여기에다가 string 변수값 넣어서 
		//해당 값에 인수값을 적용하여 bbox class에 있는 필드명 중 user_info에 적용하는형태
		this.user_info=nm; //★출력 가능쓰!
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
	}
}