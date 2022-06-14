import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 응용문제 상품가격은 42000원 입니다.
		 사용자가 해당 상품을 갯수를 입력하게 됩니다.
		 해당 상품 가격에 맞는 갯수 만큼 곱하여 최종 결제 금액을
		 출력시키는 extends를 제작하시면 됩니다.
		 단, 42000은 절대 숫자가 바뀌면 안됩니다. 
		 사용자가 최대 구매 할 수 있는 갯수는 5개 입니다.
		 최종결과 값은 main method에서 출력합니다.
		 */
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("갯수를 입력하세요. 최대 5");
		int uu = sc.nextInt();
		b bx = new b();
		bx.b2(uu);
		System.out.println(bx.sum);
	}

}

class a {
	protected int user; 
	protected int sum;
	public a() {
		this.user = 42000;

	}
}

class b extends a {
	public void b2(int mm) {
		sum = this.user * mm;
		
	}
}

	