
public class test2 {

	public static void main(String[] args) {
		/* 배열값중 css라는 단어를 뺴고 나머지 출력 if문이 안 */
		/* 배열값중 css라는 단어가 있는지 확인하는 출력 프로세서를 제작 if문이 안,밖 */

		String adata[] = { "자바", "HTML", "CSS", "스프링" };
		int w = 0;
		int ea = adata.length;
		while (w < ea) { // (w<=ea-1 이렇게 써두댐!!
			if (!adata[w].equals("CSS")) { // == (숫자,ture,false,null)일때 사용
				System.out.println(adata[w]);
			}

			// System.out.println(adata[w]);
			w++;
		}

		int z = 0;
		Boolean k = false;

		while (z < ea) {
			if (adata[z].equals("CSS")) {
				k = true;

			}

			z++;
		}
		if(k==false){
			System.out.println("해당 단어는 없습니다");
		}
		else {
			System.out.println("해당 단어가 포함되어있습니다.");
		}
}
}