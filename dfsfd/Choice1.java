package dfsfd;

import java.awt.Choice;
import java.awt.Frame;

public class Choice1 extends Frame {
	// �޺� �ڽ� ���� ����
	Choice ch;

	// ���̺��� �ִ� �޺� �ڽ� ������
	public Choice1(String str) {
		super(str);
		// �޺� �ڽ� ��ü ����
		ch = new Choice();
		// �޺� �ڽ� ������ ����
		ch.addItem("ġŲ");
		ch.addItem("����");
		ch.addItem("�ܹ���");
		// �߰�
		add(ch);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		// �޺� �ڽ� ������
		new Choice1("���̽� �׽�Ʈ");
	}
}
