package Xuesheng;

public class StudentBiz {
				Student[] student=new Student[30];
				public void addStudent(Student stu) {
					for (int i = 0; i < student.length; i++) {
					if (student[i]==null) {
						student[i]=stu;
						break;
					}	//if
					}//for
				}//1
				public void showStudents() {
					System.out.println("********本班学生代表********");
					for (int i = 0; i < student.length; i++) {
						if(student[i]!=null) {
							System.out.println("学生姓名:"+student[i].name+"\t学生年龄:"+student[i].age+"\t学生分数:"+student[i].score+"\t学生编号:"+student[i].id);
						}//if
					}//for
				}
}
