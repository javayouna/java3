import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/* 
	  GUI ���: (Java7) AWT (abstract window ����Ʋ), SWING( AWT-�׷���) 
	  CUI ���: Scanner
	 
	  ���� SWING�� ���� �� 
	  SWING : JFrame -> JPanel -> JObject
	 */
	
	
	
	public static void main(String[] args) {
	//awt ������� 
	//Frame -> Panel -> Object (���� )
	//object -> panel -> Frame (����)

	popclose pc = new popclose();
	Frame fr = new Frame(); //������ ���� 
	fr.setTitle("����� �α���"); //â �̸� 
	fr.setSize(500, 500); //â ũ��
	fr.setVisible(true); //��� ��/��
	fr.addWindowListener(pc); //awt �޼ҵ带 ��ӹ޾Ƽ� ó��
	
	Panel pa = new Panel(); //�г�
	
	CheckboxGroup radio = new CheckboxGroup();
	
	TextField id = new TextField(10); //TextField 10�ڱ��� 
	TextField pw = new TextField(10);
	TextField sa = new TextField("�����ȣ�� �Է��ϼ���."); //�Էµ����Ͱ� ���\\�̸�����
	Button b1 = new Button("�α���"); //Object ��ư
	Checkbox c1 = new Checkbox("�ڵ��α���");
	Checkbox c2 = new Checkbox("������",false,radio);	
	Checkbox c3 = new Checkbox("���Ǿ���",true,radio);	
	
	
	pa.add(c2);
	pa.add(c1);
	pa.add(sa);
	pa.add(id);
	pa.add(pw);
	pa.add(b1); //add �߰� ������Ʈ > �г�����
	fr.add(pa); //��� > ������
	
	
	}

}

class popclose extends WindowAdapter{
	
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
		
		
	}
	
	
}
