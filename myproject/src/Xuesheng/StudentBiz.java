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
					System.out.println("********����ѧ������********");
					for (int i = 0; i < student.length; i++) {
						if(student[i]!=null) {
							System.out.println("ѧ������:"+student[i].name+"\tѧ������:"+student[i].age+"\tѧ������:"+student[i].score+"\tѧ�����:"+student[i].id);
						}//if
					}//for
				}
}
