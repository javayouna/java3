
public class Method5 {

	public static void main(String[] args) {
	//this 
		
		cdb c = new cdb();
		/*c.d1="홍길동";
		c.data2();
		c.d3="이순신";
		c.data1();
		c.d3="유관순";
		System.out.println(c.data3());
	*/
		
		//c.d2="강감찬"; private로 선언한 객체라서 main class에서 로드 못함..!
		c.data2("강감찬");
		String result=c.data3();
		System.out.println(result);
		c.d1="유관순"
;		cdb.data1();
	}
	

}
class cdb{
	String d1=null; /*void, 자료형 메소드 로드 가능 */
	private String d2=null;
	public static String d3;/*다 사용가능*/
	
	public static void data1() { /*static 자료형 외에는 로드 불가능함*/
		//System.out.println(d3);
		//System.out.println(this.d2);
		String d1 ="홍길동";
		System.out.println(d1); //위에서 유관순 던졌지만 홍길동이 뜬다 why? String d1=홍길동 또 선언했자낭 
	}
	
	public void data2(String user) {
		//System.out.println(d1);
		this.d2=user;
		System.out.println(this.d2);
	}
	public String data3() {
		String a=this.d2;
		return a;
	}
	
}

