package List_ArrayList;

import java.util.*;

public class test1123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List list=new ArrayList();
			list.add("A");
			list.add("B");
			list.add("C");
			print(list);
	}
		public static void print(List Plist) {
			for (int i = 0; i < Plist.size(); i++) {
				String ster=(String) Plist.get(i);
				System.out.println(ster);
			}
		}
		
	
}
