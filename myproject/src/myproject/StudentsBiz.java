package myproject;



public class StudentsBiz {
			Student[] students=new Student[30];//���һ��ѧ��������
			public void addStudent(Student stu) {//����Ϊѧ���� ��һ��ѧ��
				for (int i = 0; i < students.length; i++) {
					if(students[i]==null) {
						students[i]=stu;
						break;
					}//if
				}//for
							}//1
			public void showStudents() {
				System.out.println("����ѧ���б�");
				
				for (int i = 0; i < students.length; i++) {
					if(students[i]!=null) {
						System.out.println("����:"+students[i].name+"\tѧ��"+students[i].id+"\t����"+students[i].score+"\t���䣺"+students[i].age);
						
					}//if
				}//for
				
			}//2
}
