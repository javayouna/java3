
public class Method13 {

	public static void main(String[] args) {
	//extends : inherit(상속) 
	
	/*
	 * 절대 부모 클래스 Construct 부분 ()에 인수값 적용하면 
	 * 자식 클래스에서 로드를 못하는 상황이 발생함
	 * 단, 자식 클래스에서 인수값을 적용하여 Construct를 사용 할 수는 있음..ㅇ0ㅇ
	 */
		mth1 m1 =new mth1();
		mth2 m2 =new mth2(50);	

	}
}

class mth1{
	public int no;
	public mth1() {//내가 extends mth2를 상속하려고 하면..! mth1 public에다가 ()인수 값 넣으면 상속 안됨
		this.no=20;
		System.out.println("mth1");
		
		
	}
}
class mth2 extends mth1{
	public mth2(int z) {  //자식에는 넣어두 댐!
		this.no=50;
		System.out.println("mth2");
		System.out.println(this.no);
		
	}
	
	
	
}