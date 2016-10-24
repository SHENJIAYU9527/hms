package zju.ningkai.test;

import org.dom4j.Element;
import zju.ningkai.util.XmlParser;

public class TestXmlParser {

	public static void main(String[] args) {
	   
		String xmlPath="WebContent\\xml\\text.xml";
		Element root=XmlParser.getRootNode(xmlPath);
		if(root!=null){
			System.out.println(root.getName().toString());
		}
		

	}

}
