package myproject;

import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentsBiz ss=new StudentsBiz();
		for (int i = 0; i < 4; i++) {
			Student student=new Student();
			System.out.print("�������"+(i+1)+"��ѧ��������");
			student.name=input.next();
			System.out.print("�������"+(i+1)+"��ѧ��������");
			student.age=input.nextInt();
			System.out.print("�������"+(i+1)+"��ѧ����ѧ��");
			student.id=input.nextInt();
			System.out.print("�������"+(i+1)+"��ѧ���ķ���");
			student.score=input.nextInt();
			ss.addStudent(student);
		}
						
		ss.showStudents();
	}

}
