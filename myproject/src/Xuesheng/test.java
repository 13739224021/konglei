package Xuesheng;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		StudentBiz ss=new StudentBiz();
		for (int i = 0; i < 3; i++) {
			Student student=new Student();
			System.out.print("请输入年龄");
			student.age=input.nextInt();
			System.out.print("请输入姓名");
			student.name=input.next(); 
			System.out.print("请输入编号");
			student.id=input.nextInt();
			System.out.print("请输入分数");
			student.score=input.nextInt();
			ss.addStudent(student);
		}
ss.showStudents();
	}

}
