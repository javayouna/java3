import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		/*
		 * 응용문제 extends 사용해야 함 extends를 사용하여 다음 결과 코드를 작성하세요. 숫자 두 개를 입력합니다. 두 개의 숫자를
		 * 확인하여 다음과 같이 체크합니다. 첫번째 숫자가 두 번째 숫자보다 작을 경우 첫번째 숫자가 두 번째 숫자보다 클 경우 첫번째 숫자가 두
		 * 번째 숫자랑 같은 경우
		 * 
		 * 첫번째 숫자가 작을 경우:해당 두 개의 값을 합친 결과값 출력 두번째 숫자가 작을 경우:해당 두 개의 값을 합친 결과값 출력 첫번째와
		 * 두번째 숫자가 같은 경우:"해당 값이 같습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번 쨰 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두번 쨰 숫자를 입력하세요.");
		int b = sc.nextInt();
		cba yn = new cba();
		yn.ccc(a, b);
		
		yn.ddd();
		sc.close();
		System.exit(0);
	}

}

class abc {
	protected int i;
	protected int ii;
	protected int sum;

	public void ccc(int i, int ii) {
		this.i = i;
		this.ii = ii;
	}
}

class cba extends abc {
	public void ddd() { //이게 setter
		if (i < ii) {
			this.sum = i + ii;
			System.out.println(this.sum);
		}
		else if (i > ii){
			do {
				this.sum += ii; //
				ii++;
			} while (i >= ii);
			System.out.println(this.sum);
		} 
		else {
			System.out.println("해당 값이 같습니다.");
		}
	}
}
