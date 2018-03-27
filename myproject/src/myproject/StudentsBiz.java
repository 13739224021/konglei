package myproject;



public class StudentsBiz {
			Student[] students=new Student[30];//添加一个学生类数组
			public void addStudent(Student stu) {//参数为学生类 的一个学生
				for (int i = 0; i < students.length; i++) {
					if(students[i]==null) {
						students[i]=stu;
						break;
					}//if
				}//for
							}//1
			public void showStudents() {
				System.out.println("本班学生列表：");
				
				for (int i = 0; i < students.length; i++) {
					if(students[i]!=null) {
						System.out.println("姓名:"+students[i].name+"\t学号"+students[i].id+"\t分数"+students[i].score+"\t年龄："+students[i].age);
						
					}//if
				}//for
				
			}//2
}
