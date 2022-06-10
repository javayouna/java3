
public class test3 {

	public static void main(String[] args) {
		
		String a ="홍길동";
		String b ="";
		String c ="hong@email.com";
		//&&무조건 조건이 모두다 맞아야 하는 경우  
		if( (a=="홍길동" && b=="hong") || (a=="홍길동" && c=="hong@email.com")) { //아이디랑 패스워드랑 묶었음 ()이렇게 세트가 되게 
			//System.out.println("해당 사용자 정보를 확인 하였습니다.");
		}
		else {
			//System.out.println("해당 사용자 정보를 확인 할 수 없습니다.");
		}
		// ||조건이 하나라도 맞으면 적용되는 부분 
		if(a=="홍길동"||b=="hong"||c=="hong@email.com") {
			System.out.println("해당 사용자 정보를 확인 하였습니다.");;
		}
		else {
			System.out.println("해당 사용자 정보를 확인 할 수 없습니다.");
		}
		
		
		int no = 24;
		if(no%2==0 && no%3==0) { // &&두 조건이 모두 맞아야 성립이 되는 것 
			System.out.println("2의 배수 및 3의 배수 모두 속합니다.");
		}
		
		else {
			System.out.println("해당 값은 교집합에 포함 되지 않습니다.");
		}
	
		if(a=="이순신") {
			if(b=="lee") {
				if(c=="hong@email.net") {
					System.out.println("회원 정보가 확인됨");
				}
			}
		}
		
		
		
	}

}
