package dfsfd;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
 
public class ListTest extends Frame
{
    Panel p;
    List list;
 
    public ListTest(String str)
    {        
        super(str);
        // �г� ����
        p = new Panel();
        // ũ�� 2�� �迭 ����
        list = new List(2,true);
        // ����Ʈ 
        list.add("ġŲ");
        list.add("����");
        list.add("�ܹ���");
        list.add("����");
        p.add(list);
        add(p);
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String args[])
    {
        // ����Ʈ ������ ȣ��
        new ListTest(" ���� ����Ʈ");
    }
}
