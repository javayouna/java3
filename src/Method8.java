import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 협업 프로그래머가 해당 DB 값 중,
		 * 홀수값에 대한 총 갯수를 받고자 합니다.
		 * 해당 갯수를 출력될 수 있도록 코드를 작성하세요.
		 */

		odbc ap = new odbc();	
		//System.out.println(ap.age[i]);
		int gugu=ap.aaa(); //odbc od = new odbc();  
		System.out.println(gugu); //(od.aaa());
	}

}

class odbc{

	private int odata[]; //배열값이 변경되지 않도록 사용 
	private int count=0; //홀수 일 경우 +1씩 증가 하기 위한 필드 변수 값
	
	public odbc() {
		
		int odata2[]= {15,22,17,14,32,35,19,33};
		this.odata=odata2;
	
	}
	
	
	public int aaa() { //main으로 보낼 애는 apap()<-여기에 인자값 있으면 안됨 
		int w=0;
		int ea=this.odata.length;
		while(w<ea) {
			if(this.odata[w]%2==1) {
				this.count++; //홀수이면 +1씩 증가
			}
			w++;
		}
		return this.count; // 최종 값을 return시킴 return에는 this 붙여주기.
	
	}
}