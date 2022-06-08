import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * [숙제 응용문제] 배열을 생성해야 함 관리자에서 메뉴를 활성화 하는 프로세서입니다. 해당 메뉴 활성화는 2차 배열이며, 메뉴명,
		 * 활성화하는(Y,N)구분합니다. 해당 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후 메인에서
		 * 출력되도록 합니다. [결과] [로켓배송, 로켓프레시, 골드박스,이벤트,추석] 단, private 및 return을 활용하여 프로그램을
		 * 작성합니다.
		 */

		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
		
		
	}
}
/* 반복문?? 7바퀴, Y값 재출력(조건문 if)*/
class menus {
	private String mdata[][];
	private String rdata[];
	String a;
	public menus() {
		String ms[][] = { { "로켓배송", "로켓프레시", "쿠팡비즈", "골드박스", "이벤트", "설날", "추석" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };
	
		this.mdata =ms;
		//System.out.println(this.mdata[0][0]); // Arrays 사용 할 때 ! Arrays.toString(this.mdata)); 이렇게하면 이상한데이터나오는데..! 2차원이니까
		//올바른 예시 Arrays.toString(this.mdata[1][1])) 이건 법칙이라서 외워야함 내가 인덱스의 값을 찍을 때는 sysout 전체 출력은 Arrays
		redata();
	}
	public void redata() {
		//
		//System.out.println(Arrays.toString(this.mdata[0]));
		int ea= this.mdata[0].length;
		String ww[]= new String[ea];
		int w=0;
		int ct=0;
		do {
			if(this.mdata[1][w].equals("Y")){
				ww[ct]=this.mdata[0][w];
				ct++;
			}
			w++;
	
		}while(w<ea);
	

		this.rdata=ww;
		
	}
	public String[] get() {
		return this.rdata;
	}

}




/* class aa{
 * int a;  -> field 필드 들어갈 수 도, 없을 수도
 * String b;  ->
 * public aaa(){ -> constructor
 * }
 *	
 *	public void
 *	public static void
 *	public String abc
 *	->method 메소드!는 절때 안 빠질것
 */



/*
 * 내가 숙제로 한것
 * 
 * 		menus yn = new menus();
		String uu[]=yn.menus();
		System.out.println(Arrays.toString(uu));
}
}
 * 
 * class menus{
 *  private String mu[];
 *  public String[] menus() 
 * { String ms[][] = {
 * {"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"}, 
 * {"Y","Y","N","Y","Y","N","Y"}
 * };
 *  mu=new String[5]; int j=0;
 *   for(int i=0;i<ms[0].length;i++) {
 * if(ms[1][i].equals("Y"))
 *  { mu[j]=ms[0][i]; j++;
 * 
 * } } return this.mu; } }
 */
