package myproject;

import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentsBiz ss=new StudentsBiz();
		for (int i = 0; i < 4; i++) {
			Student student=new Student();
			System.out.print("请输入第"+(i+1)+"个学生的姓名");
			student.name=input.next();
			System.out.print("请输入第"+(i+1)+"个学生的年龄");
			student.age=input.nextInt();
			System.out.print("请输入第"+(i+1)+"个学生的学号");
			student.id=input.nextInt();
			System.out.print("请输入第"+(i+1)+"个学生的分数");
			student.score=input.nextInt();
			ss.addStudent(student);
		}
						
		ss.showStudents();
	}

}
