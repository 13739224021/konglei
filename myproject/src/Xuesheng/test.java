package Xuesheng;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		StudentBiz ss=new StudentBiz();
		for (int i = 0; i < 3; i++) {
			Student student=new Student();
			System.out.print("����������");
			student.age=input.nextInt();
			System.out.print("����������");
			student.name=input.next(); 
			System.out.print("��������");
			student.id=input.nextInt();
			System.out.print("���������");
			student.score=input.nextInt();
			ss.addStudent(student);
		}
ss.showStudents();
	}

}
