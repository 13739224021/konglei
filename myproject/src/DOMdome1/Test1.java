package DOMdome1;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * ʵ�ֶ�XML�ļ���DOM����
 * 
 * @author Administrator
 */
public class Test1 {
		Document doc=null;
	// ����DOM��
	public void loadDocument() throws ParserConfigurationException, SAXException, IOException {
		// 1��������������ʵ��
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		// 2�ӽ���������ʵ���л�ȡһ��������ʵ��
		DocumentBuilder db=dbf.newDocumentBuilder();
		// 3����XML�ļ����õ�DOM��
		db.parse("�ֻ�.xml");
	}
	public void showInfo() {
		//��ʾ��Ϣ  1.��ȡ����Ʒ�Ʊ�ǩ brand
		NodeList nl=doc.getElementsByTagName("brand");
		for (int i = 0; i < nl.getLength(); i++) {
			Node nodebrand=nl.item(i);
			Element brandEle=(Element)nodebrand;
			String brandele=brandEle.getAttribute("name");
			//��ȡbrand�����ӽڵ�
			NodeList typelist=brandEle.getChildNodes();
			//���������ӽڵ�
			for (int j = 0; j <typelist.getLength(); j++) {
				Node nodetype=typelist.item(j);
				//�����ǰNode��һ��Element������ת��
				if (nodetype.getNodeType()==Node.ELEMENT_NODE) {
					Element typeEle=(Element)nodetype;
					//��ȡ��Element��Name����
					String typeele=typeEle.getAttribute("name");
					System.out.println("Ʒ��Ϊ:"+brandele+",�ͺ�Ϊ:"+typeele);
				}
				
			}
		}
	}
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	Test1 ts=new Test1();
	ts.loadDocument();//������
	ts.showInfo();
}
}
