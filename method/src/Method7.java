import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		apink ap= new apink("홍길동",25,"test@test.com",-1000);
        //apink ap= new apink(null);
		//ap.names();

		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink{
	//private선언은 class 필드에서 생성해야합니다.
	//String nm2;
	private String nm; 
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm=="홍길동") {
		this.nm="hong";

		String e[]=this.email.split("@"); //이메일 중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
		//System.out.println(Arrays.toString(e));
			this.email_cp=e[1];
		}
	}

	public apink(String nm1, int age2, String email3, int point4) { //private를 안에서 사용하지 못함
		//setter 형태
		this.nm=nm1;
		this.email =email3;
		if(point4<0) {
			this.point=0;

		}
		else {
			this.point=point4;
		}
		
	}
	public String data() {
		names();
		return this.email_cp;
		//return this.nm; //return은 맨 마지막에 사용!!!!!!!!! return밑에 코드 넣으면  모든 코드가 오류
	}
	
	public int data2() {
		//getter 형태
		return this.point;
	}
	
}