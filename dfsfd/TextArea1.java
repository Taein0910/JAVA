package dfsfd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
 
public class TextArea1 extends Frame
{
    public TextArea1(String str)
    {
          super(str);
        // �г� ����
        Panel p = new Panel();
        // �ؽ�Ʈ ����� 10�� 30�� ����
        TextArea txt1 = new TextArea(10,30);
        // �ؽ�Ʈ �ʵ� ����
        TextField txt2 = new TextField("Hello Java",20);    
        txt1.setText("  Java World ");
        // ���� ���
          txt1.setBackground(Color.yellow);
        // ��Ʈ �ü�ü
          txt1.setFont(new Font("�ü�ü",Font.BOLD, 10));
        // ��Ʈ�� �Ķ�
          txt1.setForeground(Color.blue);
        // �ؽ�Ʈ�ʵ� '@'�� ��ü
          txt2.setEchoChar('@');
        // �ؽ�Ʈ �ʵ� ��Ʈ �� 
          txt2.setForeground(Color.red);
          p.add(txt1); 
          p.add(txt2);      
        add(p);
          setSize(200,200);
          setVisible(true);      
    }

    public static void main(String args[])
    {
        // �ؽ�Ʈ����� ������ 
        new TextArea1("Text Area �׽�Ʈ");
 
    }
}
