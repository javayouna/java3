

public class Method1 {

	public static void main(String[] args) {
		
		tests t =new tests();
		t.a1++;
		t.a2++;
		t.name1();
		t.b1 +="유관순";
		t.b2 +="유관순";
		t.name2();
	
		tests tt=new tests();
		tt.a1++;
		tt.a2++;
		tt.name1();
		tt.b1+="강감찬";
		tt.b2+="강감찬";
		tt.name2();
	}

}

class tests{
	
	int a1=1; //(동적변수)
	//★새로운 객체 생성 및 class 호출시 1이라는 숫자를 다시 가지게 됨 / 고정값 계속 1임(초기화)
	public static int a2 =1; //(정적변수)
	//★새로운 객체 생성 및 class를 호출하더라도 1이라는 숫자가 아닌 메모리에 등록된 최종값을 지속적으로 가짐
	//t의 2를 기억하고있음 static(메모리)에 등록해놈
	
	String b1="이순신";
	public static String b2="홍길동";
	
	public void name1() {
		//System.out.println(a1);
		//System.out.println(a2);
	}
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
}
}
