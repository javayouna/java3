
public class Test6 {

	public static void main(String[] args) {
		/*���� for�� �ڵ带 do while������ �����ϼ���.*/
		
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