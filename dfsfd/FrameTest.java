package dfsfd;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
 
public class FrameTest extends Frame
{
    public FrameTest(String str)
    {
        super(str);
        Panel panel1 = new Panel();
        // 색을 빨강으로 지정
        panel1.setBackground(Color.RED);
        // 추가
        add(panel1);
        // 크기
        setSize(300,300);
        setVisible(true);
    }
}