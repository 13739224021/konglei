package SetGet;

import org.apache.log4j.Logger;

public class Test {
	public static Logger logger=Logger.getLogger(Test.class.getName());
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
				Chinapeople c=new Chinapeople();
			c.setName("孔雷");
			c.coloer="黄色";
			c.setSex("男");
			logger.debug("第一个性别"+c.getSex());
			c.print();
			Japan riben=new Japan();
			riben.coloer="白色";
			riben.setName("小日本");
			riben.setSex("女");
			logger.debug("第二个性别"+c.getSex());
			riben.print();
	}

}
