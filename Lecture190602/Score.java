
package Lecture190602;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {
	private static ArrayList<Student> studentList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��߰� | 2.�л����� | 3.�л���ȸ | 4.�����Է� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("����>> ");

			int selectNum = Integer.parseInt(scanner.next());

			switch (selectNum) {
			case 1:
				createStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				score();
				break;

			default:
				run = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}

	}

	private static void createStudent() {
		System.out.print("�л��̸�: ");
		String name = scanner.next();
		System.out.print("�л�����: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		studentList.add(s);

	}

	private static void deleteStudent() {
		System.out.println("�л��̸�: ");
		String name = scanner.next();
        boolean noneResult = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);

			if (s.getName().equals(name)) {
				noneResult=true;
				studentList.remove(i);
				System.out.println("�����Ǿ����ϴ�.");
				break;
			}
		}
		if (!noneResult) {
			System.out.println("�˻������ �����ϴ�.");
		}
	}

	private static void searchStudent() {
		System.out.println("�л��̸�: ");
		String name = scanner.next();
		boolean noneResult = false;

		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			if (s.getName().equals(name)) {
				noneResult = true;
				System.out.println("�̸�:" + s.getName() + " | ����:" + s.getAge() + " | ����:" + s.getEng() + " | ����:"
						+ s.getMat() + " | ����:" + s.getKor());
				break;
			}

		}
		if (!noneResult) {
			System.out.println("�˻������ �����ϴ�.");
		}
	}

	private static void score() {
		System.out.println("�л��̸�: ");
		String name = scanner.next();
		boolean noneResult = false;

		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);

			if (s.getName().equals(name)) {
				noneResult = true;

				System.out.println("��������: ");
				int eng = scanner.nextInt();
				System.out.println("��������: ");
				int mat = scanner.nextInt();
				System.out.println("��������: ");
				int kor = scanner.nextInt();
				System.out.println("������ ��ϵǾ����ϴ�.");

				s.setEng(eng);
				s.setMat(mat);
				s.setKor(kor);
				break;
			}

		}
		if (!noneResult) {
			System.out.println("�˻������ �����ϴ�.");
		}
	}

}
