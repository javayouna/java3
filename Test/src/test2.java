
public class test2 {

	public static void main(String[] args) {
		/* �迭���� css��� �ܾ ���� ������ ��� if���� �� */
		/* �迭���� css��� �ܾ �ִ��� Ȯ���ϴ� ��� ���μ����� ���� if���� ��,�� */

		String adata[] = { "�ڹ�", "HTML", "CSS", "������" };
		int w = 0;
		int ea = adata.length;
		while (w < ea) { // (w<=ea-1 �̷��� ��δ�!!
			if (!adata[w].equals("CSS")) { // == (����,ture,false,null)�϶� ���
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
			System.out.println("�ش� �ܾ�� �����ϴ�");
		}
		else {
			System.out.println("�ش� �ܾ ���ԵǾ��ֽ��ϴ�.");
		}
}
}