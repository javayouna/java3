import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("주소를 입력하세요.");
		String user1 = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String user2= sc.nextLine();
		
		
		System.out.println("해당정보를 확인해주세요\n 주소: "+user1+" 전화번호: "+user2);
		
	}

}
