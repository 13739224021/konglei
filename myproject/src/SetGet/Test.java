package SetGet;

import org.apache.log4j.Logger;

public class Test {
	public static Logger logger=Logger.getLogger(Test.class.getName());
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
				Chinapeople c=new Chinapeople();
			c.setName("����");
			c.coloer="��ɫ";
			c.setSex("��");
			logger.debug("��һ���Ա�"+c.getSex());
			c.print();
			Japan riben=new Japan();
			riben.coloer="��ɫ";
			riben.setName("С�ձ�");
			riben.setSex("Ů");
			logger.debug("�ڶ����Ա�"+c.getSex());
			riben.print();
	}

}
