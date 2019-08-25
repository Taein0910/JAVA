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
        // 패널 생성
        p = new Panel();
        // 크기 2행 배열 생성
        list = new List(2,true);
        // 리스트 
        list.add("치킨");
        list.add("피자");
        list.add("햄버거");
        list.add("족발");
        p.add(list);
        add(p);
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String args[])
    {
        // 리스트 생성자 호출
        new ListTest(" 선택 리스트");
    }
}
