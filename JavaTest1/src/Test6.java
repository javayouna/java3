
public class Test6 {

	public static void main(String[] args) {
		/*다음 for문 코드를 do while문으로 변경하세요.*/
		
		/* for(int d=2;d<10;d++){
			 for(int g=1; g<10;g++){
		 sysout(d+"*"+g+"="+d*g)*/
		
		int d=2;

		do {
			int g=0;
			do {
				g++;
				System.out.println(d+"*"+g+"="+(d*g));
			}while(g<9);
			d++;
		}while(d<10);
		
		
	}
}