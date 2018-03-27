package List_ArrayList;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set set=new HashSet();
			String s1="java";
			String s2="java";
			String s3="PHP";
			set.add(s1);
			set.add(s2);
			set.add(s3);
			System.out.println(set.size());
			System.out.println(set);
	}

}
