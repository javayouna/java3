import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/* 
	  GUI 모드: (Java7) AWT (abstract window 도구틀), SWING( AWT-그래픽) 
	  CUI 모드: Scanner
	 
	  애플 SWING을 많이 씀 
	  SWING : JFrame -> JPanel -> JObject
	 */
	
	
	
	public static void main(String[] args) {
	//awt 생성방식 
	//Frame -> Panel -> Object (생성 )
	//object -> panel -> Frame (적용)

	popclose pc = new popclose();
	Frame fr = new Frame(); //프레임 만듦 
	fr.setTitle("사용자 로그인"); //창 이름 
	fr.setSize(500, 500); //창 크기
	fr.setVisible(true); //사용 유/무
	fr.addWindowListener(pc); //awt 메소드를 상속받아서 처리
	
	Panel pa = new Panel(); //패널
	
	CheckboxGroup radio = new CheckboxGroup();
	
	TextField id = new TextField(10); //TextField 10자까지 
	TextField pw = new TextField(10);
	TextField sa = new TextField("사원번호를 입력하세요."); //입력데이터가 기미\\미리적용
	Button b1 = new Button("로그인"); //Object 버튼
	Checkbox c1 = new Checkbox("자동로그인");
	Checkbox c2 = new Checkbox("동의함",false,radio);	
	Checkbox c3 = new Checkbox("동의안함",true,radio);	
	
	
	pa.add(c2);
	pa.add(c1);
	pa.add(sa);
	pa.add(id);
	pa.add(pw);
	pa.add(b1); //add 추가 오브젝트 > 패널적용
	fr.add(pa); //페널 > 프레임
	
	
	}

}

class popclose extends WindowAdapter{
	
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
		
		
	}
	
	
}
