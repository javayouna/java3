import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		
		//return에 값 2개 사용하기! split을 이용함
		per p= new per();
		String info = p.userinfo();
		String info2[]=info.split(","); //문자열을 배열로 만들기
		System.out.println(Arrays.toString(info2));
		System.out.println(info2[1]);
		
		//return에 값 2개 사용하기! 배열로 이용함
		String myinfo[]=p.userinfo2();
		System.out.println(myinfo[0]+myinfo[1]);
	}

}

class per{
	public String userinfo() {
		String user_name="홍길동";
		String user_id="hong";
		String user_info=user_name+","+user_id;
		return user_info;
	}
	
	public String[] userinfo2() {
		String user_name="홍길동";
		String user_id="hong";
		String user_array[]= {user_name,user_id};
		//해당 1개이상의 값을 return으로 보낼 경우 
		return user_array;
		//return new String[] {user_name,user_id}; 요것도 됨 
	}
}