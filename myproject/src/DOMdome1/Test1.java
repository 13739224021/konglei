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
 * 实现对XML文件的DOM解析
 * 
 * @author Administrator
 */
public class Test1 {
		Document doc=null;
	// 加载DOM树
	public void loadDocument() throws ParserConfigurationException, SAXException, IOException {
		// 1创建解析器工厂实例
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		// 2从解析器工厂实例中获取一个解析器实例
		DocumentBuilder db=dbf.newDocumentBuilder();
		// 3解析XML文件，得到DOM树
		db.parse("手机.xml");
	}
	public void showInfo() {
		//显示信息  1.获取所有品牌标签 brand
		NodeList nl=doc.getElementsByTagName("brand");
		for (int i = 0; i < nl.getLength(); i++) {
			Node nodebrand=nl.item(i);
			Element brandEle=(Element)nodebrand;
			String brandele=brandEle.getAttribute("name");
			//获取brand所有子节点
			NodeList typelist=brandEle.getChildNodes();
			//遍历所有子节点
			for (int j = 0; j <typelist.getLength(); j++) {
				Node nodetype=typelist.item(j);
				//如果当前Node是一个Element，进行转换
				if (nodetype.getNodeType()==Node.ELEMENT_NODE) {
					Element typeEle=(Element)nodetype;
					//获取此Element的Name属性
					String typeele=typeEle.getAttribute("name");
					System.out.println("品牌为:"+brandele+",型号为:"+typeele);
				}
				
			}
		}
	}
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	Test1 ts=new Test1();
	ts.loadDocument();//加载树
	ts.showInfo();
}
}
