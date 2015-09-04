package ex1;
// @author kosta, 2015. 8. 31 , 오전 9:24:11 , Ex1_JFrame 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//   JFrame - JPanel - btn 1 
//                     btn 2
//                     btn 3    
// Event 분석 : ActionEvent 분석 : 마우스를 클릭했승ㄹ떄 .
// 해당 이벤트를 처리할 메뉴 Interface 선택
// 감지자를 등록 후 Handler를 작성 
public class Ex1_JFrame extends JFrame implements ActionListener{
    // Botton3 
    private JButton btn1, btn2,btn3;
    // Pannel 2 
    private JPanel menu, body;
    public Ex1_JFrame() {
        // 초기화 
        // menu Panel 생성
        menu = new JPanel();
        body = new JPanel();
        // 버튼들을 생성
        btn1 = new JButton("Red");
        btn2 = new JButton("Pink");
        btn3 = new JButton("Orange");
        // 버튼의 색상을 변경
        btn1.setBackground(Color.RED);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.ORANGE);
        // 버튼에 이벤트 리서너를 감지할 감자리를 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        // menu Panel 에 각 버튼들을 순서대로 배치 
        menu.add(btn1);
        menu.add(btn2);
        menu.add(btn3);
        // JFrame 에 menu Panel 배치
        // 기본 위치 : 동 서 남 북 중앙
        add(menu,"North");
        add(body,"Center");
        // 창의 위치와 창의 크기를 설정 
        setBounds(100, 50, 300, 500);
        // x 를 누르면 프로그램이 종료 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 창을 활성화
        setVisible(true);
       
    } // end 
    
    @Override
    public void actionPerformed(ActionEvent e) {
    // 이곳에 해당 이벤트가 동작했을 때 수행해야 될 일을 정의 해두면 
    // 이벤트 감지자가 동작되고 보고 받느 JVM이 인터페이스의 메뉴인
    // 현재 메소드를 호출 해주어서 동작이됨.
        Object obj = e.getSource();
        String msg = "";
        String str = ((JButton)obj).getText();
        setTitle("당신이 선택한 색상은 : " +((JButton)obj).getText());
       
        if (str.equals("Red")) {
            body.setBackground(Color.red);
        }else if (str.equals("Pink")){
            body.setBackground(Color.PINK);
        }else if (str.equals("Orange")){
            body.setBackground(Color.ORANGE);
        }
       
        
    }
    
    public static void main(String[] args) {
        new Ex1_JFrame();
    }

    
}
