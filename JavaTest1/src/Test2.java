
public class Test2 {

	public static void main(String[] args) {
		
  /* 점수에 따른 등급 구분 조건문 
   * 변수 하나 생성하여 해당 숫자 입력
   * 90이상(포함) "등급 A입니다."입니다.
   * 70~89	"등급 B입니다."	
   * 50~69까지 "등급 C입니다"
   * 그 외는 일반 등급입니다.
   * 단 sysout 은 한번 */
 

	
		int a =1;
		 String msg= " " ;
		if (a>=90) {
			msg="등급 A입니다.";
		}
		else if(a>=70 && a<=89) {
			msg="등급 B입니다.";
		}
		else if(a>=50 && a<=69) {
			msg="등급 C입니다.";
		}
		else {
			msg="일반 등급입니다.";
		}
		 System.out.println(msg);
	}

}
