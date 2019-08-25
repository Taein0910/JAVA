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
        // 패널 생성
        Panel p = new Panel();
        // 텍스트 에어리어 10행 30열 생성
        TextArea txt1 = new TextArea(10,30);
        // 텍스트 필드 생성
        TextField txt2 = new TextField("Hello Java",20);    
        txt1.setText("  Java World ");
        // 배경색 노랑
          txt1.setBackground(Color.yellow);
        // 폰트 궁서체
          txt1.setFont(new Font("궁서체",Font.BOLD, 10));
        // 폰트색 파랑
          txt1.setForeground(Color.blue);
        // 텍스트필드 '@'로 대체
          txt2.setEchoChar('@');
        // 텍스트 필드 폰트 색 
          txt2.setForeground(Color.red);
          p.add(txt1); 
          p.add(txt2);      
        add(p);
          setSize(200,200);
          setVisible(true);      
    }

    public static void main(String args[])
    {
        // 텍스트에어리어 생성자 
        new TextArea1("Text Area 테스트");
 
    }
}
