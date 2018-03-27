package Yichang;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("请输入第一个数字");
			int num1 = input.nextInt();
			System.err.println("请输入第二个数字");
			int num2 = input.nextInt();
			int jg = num1 / num2;
			System.out.println(jg);
		} catch (ArithmeticException a) {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
