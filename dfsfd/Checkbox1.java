package dfsfd;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
 
// ��ư�� ��ģ������ ��ġ�� �ʵ��� ����
public class Checkbox1 extends Frame
{
    // ���̺��� �ִ� ������
    public Checkbox1(String str)
    {
        super(str);
        // �г� ����
        Panel p = new Panel();
        // ġŲ üũ �ڽ� üũ ǥ��
        Checkbox cbx1=new Checkbox("ġŲ", true);
        // ���� üũ �ڽ� ����Ʈ���� true
        Checkbox cbx2=new Checkbox("����");    
        // ���� üũ �ڽ� ����Ʈ���� true
        Checkbox cbx3=new Checkbox("�ܹ���");
        // �гο� ����
        p.add(cbx1);
        p.add(cbx2);
        p.add(cbx3);
        
        // üũ �ڽ� �׷� ����
        CheckboxGroup group = new CheckboxGroup();
        // ġŲ üũ �ڽ� üũ ǥ��
        Checkbox cbx4=new Checkbox("ġŲ",group,true);
        // ���� üũ �ڽ� üũ ǥ��X
        Checkbox cbx5=new Checkbox("����",group,false);    
        // �ܹ��� üũ �ڽ� üũ ǥ��X
        Checkbox cbx6=new Checkbox("�ܹ���",group,false);
        // �гο� ����
        p.add(cbx4);
        p.add(cbx5);
        p.add(cbx6);
 
        add(p);
        // ������ ������ 180 x 300
        setSize(180, 300);
        // ������ 
        setVisible(true);
    }
 

    public static void main(String args[])
    {
        // üũ�ڽ� 
        new Checkbox1("üũ �ڽ� �׽�Ʈ");
    }
}
