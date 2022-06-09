import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		[up&down 게임]

	A파트:PC 랜덤..스캐너 이용 (5)돌려야함 
	B파트:PC 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과처리

pc가 숫자를 하나 선택? 힌트 random 1~10
총 기회는 x번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
만약에 pc가 숫자 7을 선택
-pc:7 사용자 :2 -> 결과 up
총 기회는 x번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
pc:7 사용자:4  ->결과 up
총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
pc:7 사용자:7 ->정답입니다. 모든 프로세서는 정지 */

		int rotto = (int)(Math.random()*10)+1;
		Scanner sc = new Scanner(System.in);
		int e=5;
		int user=0;
		while(e>=1) {
			System.out.println("총 기회는 "+e+"번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력");
			user=sc.nextInt();
			e--;
			Example2 ac = new Example2();
			ac.main2(rotto,user);
		}
		if(e==0) {
			System.out.println("~~게임종료~~");
		}
	
		sc.close();
	}

}
