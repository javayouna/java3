
public class Example3 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();
		ih2.it("홍길동", "aaa5");
		ih2.print();
		//순서 필드-패널-오브젝트-
		//String a = it2.print(); // public void print()에 리턴이 있을 때 만 ! 요렇게 쓸 수 있음
	
	}

}

class ingerit1 {
	private String nm; // private 클래스 내부에서만..! private을 자식클래스에서 쓰고 싶으면 값을 하나 만들어줘야함 //inherit1 부분만 작동
	protected String pw; // 외부에선 들어오지 못하지만 공용으로 사용할 수 있음 //inherit1,inherit2에서 모두 작용 외부에서 로드 못함 
	static String aa; //public String aa;도 출력 됨  //private로 받은 부분 inherit2에서도 사용할 수 있도록 하기 위해

	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		aa = this.nm;

		// String aa =this.nm; <- void 안에서만 노는 애

	}

}

class inherit2 extends ingerit1 {
	public void print() {
		System.out.println(this.aa + "" + this.pw);

	}

}