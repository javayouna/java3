
public class Example4 {

	public static void main(String[] args) {

		/*
		 * 응용문제 두 개의 값을 외부 클래스로 보냅니다. 해당 클래스에서 두 개의 값을 계산하게됩니다. 계산형식 다음과 같습니다. 3,10을 보내게
		 * 되면 두개의 값의 합을 구합니다. 나머지 외부 클래스에서 해당 결과 값을 출력하는데 두 개의 합 값이 짝수, 홀수 인지를 출력하는
		 * extends를 구현하세요
		 */
		text2 yn = new text2();
		yn.ii(3, 10); // ★얘랑 밑에 얘랑 순서 바뀌면 답이 바뀜 와우~
		yn.huhu(); // ★얘랑!!

	}

}

class text {

	protected int sum;

	public void ii(int a, int aa) {
		this.sum = a + aa;

	}
}

class text2 extends text {
	public void huhu() {
		if (this.sum % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}