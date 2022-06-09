public class Method3 {

	public static void main(String[] args) {

		/*
		 * [응용문제] 인수값 2개의 숫자를 적용하여 계산되도록 합니다. 최종 계산을 받아서 결과를 출력하세요. [결과] 157, 45 157*45
		 * 최종 결과값 출력
		 */

		math2 ma = new math2();
		int r = ma.m(5);
		System.out.println(r);
		
		/*
		 * [응용문제] 다음 숫자 하나를 해당 메소드로 전달 하게됩니다. 해당 메소드에서는 다음과 같이 처리합니다. 숫자 3을 전달하면
		 * 3*1~3*9까지의 모든 결과 값을 더하여 sysout으로 출력되도록 하십시오.
		 */
		String ck=ma.mb("hong");
			System.out.println(ck);
	}
}

class math2 {

	public int m(int a) {
		int c = 0;
		for (int b = 1; b < 10; b++) {

			c += a * b;

		}
		return c;// 반복문 안에는 return넣으면 안됨
					// 또! 조건문이라도 더블 return 안됨
	}

	public String mb(String mid) {
		String msg="";
	
		if(mid.equals("hong")) {
		 msg="ok";
	}
	else{
		msg="cancel";
	}
		return msg;/*해당 메소드에 변수 생성 후 조건에 맞는 값을
		 적용해서 최종적인 값을 return시킴*/

	// public void m2() {
	// int z = m(100, 200); // 같은 클래스에있으니까 m만 씀
	// System.out.println(z);

}
}
