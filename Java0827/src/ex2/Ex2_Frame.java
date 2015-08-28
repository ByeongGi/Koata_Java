package ex2;
// @author kosta, 2015. 8. 27 , 오후 2:32:57 , Ex2_Frame 
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ex2_Frame extends JFrame{
    private JPanel p1;
    private JButton btn;
    public Ex2_Frame(){
        p1 = new JPanel();
        btn = new JButton("Mybtn");
      
        setTitle("Mytest");
        setBounds(100,100,300,300);
        
        p1.setBackground(Color.red);
        btn.setBackground(Color.YELLOW);
        p1.add(btn);
        
        add(p1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    } 
    public static void main(String[] args) {
        new Ex2_Frame();
    }
}
