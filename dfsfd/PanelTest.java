package dfsfd;
	
	import java.awt.*;
	
	public class PanelTest extends Frame {
	
		public PanelTest(String str) {
			super(str);
			Panel panel1 = new Panel();
			// ���� �������� ����
			panel1.setBackground(Color.RED);
			// �߰�
			add(panel1);
			// ũ��
			setSize(300, 300);
			setVisible(true);
		}
	
		 public static void main (String[] args) {
			new PanelTest("�г� �׽�Ʈ");
		}
	}
