package ex1;
// @author kosta, 2015. 9. 7 , 오전 11:15:34 , Mock_Canvas 
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
    // 사용자가 repaint() 호출하면 JVM 은 updata를 호출하고 
    // updata는 화면을 갱신하는 역할을 한 후 paint()를 호출해서 다시 그린다. 
public class Mock_Canvas {
    private int x,y,rx,ry;
    private Color col;
    Canvas can = new Canvas(){

        @Override
        public void update(Graphics g) {
            super.update(g); 
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(col);
            g.fillOval(x, y, rx, ry);
        }
        
        
    };
}
