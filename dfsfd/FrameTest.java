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
        // ���� �������� ����
        panel1.setBackground(Color.RED);
        // �߰�
        add(panel1);
        // ũ��
        setSize(300,300);
        setVisible(true);
    }
}