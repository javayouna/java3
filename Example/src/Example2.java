
public class Example2 {


		
		
	private int rotto2;

	
	public void main2(int rotto2,int user2) {
		 
		if (user2 > rotto2) {
		System.out.println("▽Down▽");
		
		}
		
		else if(user2<rotto2) {
			System.out.println("▲UP▲");
			
		}
		else if(user2==rotto2) {
			System.out.println("정답입니다.");
			System.exit(0); //여기다가쓰면 계속 살아있음 Example1 에서 생성
		}

		}
		
}

//private int val1; //pc
//private int val2; //user
//private String msg; //결과메세지
//
//
//public void randomck(int pc, int user) { //setter(인수값을 받음)
//	this.val1=pc;
//	this.val2=user;
//	if(this.val1 > this.val2){
//		this.msg ="UP 입니다";
//		
//	
//	}
//	else if(this.val1 < this.val2) {
//		this.msg ="DOWN 입니다";
//		
//}
//	else {
//		this.msg ="정답입니다.";
//	}
//	
//}	
//public String result() {//getter(인수값x) return ! 자료형으로 만들어야함 
//	return this.msg;
//}
//	
//}	
