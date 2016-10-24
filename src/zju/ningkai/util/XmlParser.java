package zju.ningkai.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @version 0.0.1
 * @author ningkai
 * @since 2016-10-24
 *
 */
public class XmlParser {

	/**
	 * @what 生成空的xml文件头
	 * @param xmlPath
	 * @return Document
	 * @time 2016-10-24 19:40:00
	 */
	public static Document createEmptyXmlFile(String xmlPath) {
		if (xmlPath == null || xmlPath.equals("")) {
			return null;
		}
		XMLWriter output;
		Document document = DocumentHelper.createDocument();
		OutputFormat format = OutputFormat.createPrettyPrint();
		try {
			output = new XMLWriter(new FileWriter(xmlPath), format);
			output.write(document);
			output.close();
		} catch (IOException e) {

			return null;
		}
		return document;
	}

	/**
	 * @what 根据xml文件路径获取document对象
	 * @param xmlPath
	 * @return
	 * @time 2016-10-24 19:41:00
	 */
	public static Document getDocument(String xmlPath) {
		if (xmlPath == null || xmlPath.equals("")) {
			return null;
		}
		File file = new File(xmlPath);
		if (file.exists() == false) {
			return createEmptyXmlFile(xmlPath);
		}
		SAXReader reader = new SAXReader();

		Document document = null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		return document;
	}

	/**
	 * @what 获取根节点
	 * @param document
	 * @return
	 * @time 2016-10-24 19:45:00
	 */
	public static Element getRootNode(Document document) {
		if (document == null) {
			return null;
		}
		Element root = document.getRootElement();
		return root;
	}

	/**
	 * @what 根据路径直接获取根节点
	 * @param xmlPath
	 * @return
	 * @time 2016-10-24 19:50:00
	 */
	public static Element getRootNode(String xmlPath) {
		if (xmlPath == null || xmlPath.equals("")) {
			return null;
		}
		Document document = getDocument(xmlPath);
		if (document == null) {
			return null;
		}

		return getRootNode(document);
	}

	/**
	 * @what 获取指定元素的迭代器
	 * @param parent
	 * @return
	 * @time 2016-10-24 20:00:00
	 */
	@SuppressWarnings("unchecked")
	public static Iterator<Element> getIterator(Element parent) {
		if (parent == null) {
			return null;
		}

		Iterator<Element> iterator = parent.elementIterator();
		return iterator;
	}

	/**
	 * @what 根据子节点名称获取指定的子节点
	 * @param parent
	 * @param childName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<Element> getChildElements(Element parent, String childName) {
		childName = childName.trim();
		if (parent == null) {
			return null;
		}
		childName += "//";
		List<Element> childElements = parent.selectNodes(childName);
		return childElements;

	}

	/**
	 * @what 根据节点获取其子节点列表
	 * @param node
	 * @return
	 */
	public static List<Element> getChildList(Element node) {
		if (node == null) {
			return null;
		}
		Iterator<Element> iterator = getIterator(node);
		if (iterator == null) {
			return null;
		}
		List<Element> childList = new ArrayList<Element>();
		while (iterator.hasNext()) {
			Element kidElement = iterator.next();
			if (kidElement != null) {
				childList.add(kidElement);
			}
		}
		return childList;
	}

	/**
	 * @what 查询没有子节点的节点，使用xPath方式
	 * @param parent
	 * @param nodeName
	 * @return
	 */
	public static Node getSingleNode(Element parent, String nodeName) {
		nodeName = nodeName.trim();
		String xPath = "/";
		if (parent == null) {
			return null;
		}
		if (nodeName == null || nodeName.equals("")) {
			return null;
		}
		xPath += nodeName;
		Node kid = parent.selectSingleNode(xPath);
		return kid;
	}

	/**
	 * @what 不适用xPath,得到子节点
	 * @param parent
	 * @param childName
	 * @return
	 * @time 2016-10-04 20:30:00
	 */
	public static Element getChild(Element parent, String childName) {
		childName = childName.trim();
		if (parent == null) {
			return null;
		}
		if (childName == null || childName.equals("")) {
			return null;
		}
		Element element = null;
		Iterator<Element> it = getIterator(parent);
		while (it != null && it.hasNext()) {
			Element kid = it.next();
			if (kid == null) {
				continue;
			}
			if (kid.getName().equalsIgnoreCase(childName)) {
				element = kid;
				break;
			}

		}
		return element;
	}

	/**
	 * @what 判断节点是否还有子节点
	 * @param e
	 * @return
	 */
	public static boolean hasChild(Element e) {
		if (e == null)
			return false;
		return e.hasContent();
	}

	/**
	 * @what 得到节点的属性迭代器
	 * @param e
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Iterator<Attribute> getAttrIterator(Element e) {
		if (e == null)
			return null;
		Iterator<Attribute> attrIterator = e.attributeIterator();
		return attrIterator;
	}

	/**
	 * @what 遍历指定节点的所有属性
	 * @param e
	 * @return
	 */
	public static List<Attribute> getAttributeList(Element e) {
		if (e == null)
			return null;
		List<Attribute> attributeList = new ArrayList<Attribute>();
		Iterator<Attribute> atrIterator = getAttrIterator(e);
		if (atrIterator == null)
			return null;
		while (atrIterator.hasNext()) {
			Attribute attribute = atrIterator.next();
			attributeList.add(attribute);
		}
		return attributeList;
	}

	/**
	 * @what 得到指定节点的指定属性
	 * @param element
	 * @param attrName
	 * @return
	 */
	public static Attribute getAttribute(Element element, String attrName) {
		attrName = attrName.trim();
		if (element == null)
			return null;
		if (attrName == null || attrName.equals(""))
			return null;
		Attribute attribute = element.attribute(attrName);
		return attribute;
	}

	/**
	 * @what 获取指定节点指定属性的值
	 * @param e
	 * @param attrName
	 * @return
	 */
	public static String attrValue(Element e, String attrName) {
		attrName = attrName.trim();
		if (e == null)
			return null;
		if (attrName == null || attrName.equals(""))
			return null;
		return e.attributeValue(attrName);
	}

	/**
	 * @what 获取指定节点的所有属性和值
	 * @param e
	 * @return
	 */
	public static Map<String, String> getNodeAttrMap(Element e) {
		Map<String, String> attrMap = new HashMap<String, String>();
		if (e == null) {
			return null;
		}
		List<Attribute> attributes = getAttributeList(e);
		if (attributes == null) {
			return null;
		}
		for (Attribute attribute : attributes) {
			String attrValueString = attrValue(e, attribute.getName());
			attrMap.put(attribute.getName(), attrValueString);
		}
		return attrMap;
	}

	/**
	 * @what 遍历指定节点下的没有子节点的元素的text值
	 * @param e
	 * @return
	 */
	public static Map<String, String> getSingleNodeText(Element e) {
		Map<String, String> map = new HashMap<String, String>();
		if (e == null)
			return null;
		List<Element> kids = getChildList(e);
		for (Element e2 : kids) {
			if (e2.getTextTrim() != null) {
				map.put(e2.getName(), e2.getTextTrim());
			}
		}
		return map;
	}

	/**
	 * @what 遍历根节点下没有子节点的元素节点，并将此节点的text值放入map中返回
	 * @param xmlFilePath
	 * @return
	 */
	public static Map<String, String> getSingleNodeText(String xmlFilePath) {
		xmlFilePath = xmlFilePath.trim();
		if (xmlFilePath == null || xmlFilePath.equals("")) {
			return null;
		}
		Element rootElement = getRootNode(xmlFilePath);
		if (rootElement == null || !hasChild(rootElement)) {
			return null;
		}
		return getSingleNodeText(rootElement);
	}
	
	public enum Flag {
		one, more
	}
  
	/**
	 * @what 根据xml路径和指定的节点的名称，得到指定节点,从根节点开始找 
	 * @param xmlFilePath
	 * @param tagName
	 * @param flag
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "incomplete-switch" })
	public static <T> T getNameNode(String xmlFilePath, String tagName, Flag flag) {
		xmlFilePath = xmlFilePath.trim();
		tagName = tagName.trim();
		if (xmlFilePath == null || tagName == null || xmlFilePath.equals("") || tagName.equals(""))
			return null;
		Element rootElement = getRootNode(xmlFilePath);
		if (rootElement == null)
			return null;
		List<Element> tagElementList = getNameElement(rootElement, tagName);
		if (tagElementList == null)
			return null;
		switch (flag) {
		case one:
			return (T) tagElementList.get(0);
		}
		return (T) tagElementList;
	}
	/**
	 * @what 得到指定节点下所有子节点的属性集合  
	 * @param parent
	 * @return
	 */
	public static Map<Integer,Object> getNameNodeAllKidsAttributeMap(Element parent){  
        Map<Integer,Object> allAttrMap = new HashMap<Integer, Object>();  
        if(parent == null)  
            return null;  
        List<Element> childlElements = getChildList(parent);  
        if (childlElements == null)  
            return null;   
        for (int i = 0; i < childlElements.size(); i++) {  
            Element childElement = childlElements.get(i);  
            Map<String,String> attrMap = getNodeAttrMap(childElement);  
            allAttrMap.put(i,attrMap);  
        }  
        return allAttrMap;  
    }  
	/**
	 * @what 根据xml文件名路径和指定的节点名称得到指定节点所有子节点的所有属性集合 
	 * @param xmlFilePath
	 * @param nodeName
	 * @param flag
	 * @return
	 */
	 @SuppressWarnings("unchecked")
	public static <T>T getNameNodeAllAttributeMap(String xmlFilePath,String nodeName,Flag flag){  
	        nodeName = nodeName.trim();  
	        Map<String, String> allAttrMap = null;  
	        Map<Integer,Map<String,String>> mostKidsAllAttriMap = new HashMap<Integer, Map<String,String>>();  
	        if (xmlFilePath==null||nodeName==null||xmlFilePath.equals("")||nodeName.equals(""))  
	            return null;  
	        switch (flag) {  
	        case one:  
	            Element nameNode = getNameNode(xmlFilePath, nodeName,Flag.one);  
	            allAttrMap = getNodeAttrMap(nameNode);  
	            return (T) allAttrMap;  
	        case more:  
	            List<Element> nameKidsElements = getNameNode(xmlFilePath, nodeName, Flag.more);  
	            for (int i = 0; i < nameKidsElements.size(); i++) {  
	                Element kid = nameKidsElements.get(i);  
	                allAttrMap = getNodeAttrMap(kid);  
	                mostKidsAllAttriMap.put(i,allAttrMap);  
	            }  
	            return (T) mostKidsAllAttriMap;  
	        }  
	        return null;  
	    }  
	 /**
	  * @what 遍历指定节点下的所有节点
	  * @param element
	  * @param allkidsList
	  * @return
	  */
	 public static List<Element> ransack(Element element,List<Element> allkidsList){  
	        if(element == null)  
	            return null;  
	        if(hasChild(element)){  
	            List<Element> kids = getChildList(element);  
	            for (Element e : kids) {  
	                allkidsList.add(e);  
	                ransack(e,allkidsList);  
	            }  
	        }  
	        return allkidsList;  
	    }  
	 /**
	  * @What 得到指定节点下的指定节点集合 
	  * @param element
	  * @param nodeName
	  * @return
	  */
	 public static List<Element> getNameElement(Element element ,String nodeName){  
	        nodeName = nodeName.trim();  
	        List<Element> kidsElements = new ArrayList<Element>();  
	        if(element == null)  
	            return null;  
	        if(nodeName == null || nodeName.equals(""))  
	            return null;  
	        List<Element> allKids = ransack(element,new ArrayList<Element>());  
	        if(allKids == null)  
	            return null;  
	        for (int i = 0; i < allKids.size(); i++) {  
	            Element kid = allKids.get(i);  
	            if(nodeName.equals(kid.getName()))  
	                kidsElements.add(kid);  
	        }  
	        return kidsElements;  
	    }  
	 /**
	  * @what 验证节点是否唯一 
	  * @param element
	  * @return
	  */
	 public static int validateSingle(Element element){  
	        int j = 1;  
	        if(element == null)  
	            return j;  
	        Element parent = element.getParent();  
	        List<Element> kids = getChildList(parent);  
	        for (Element kid : kids) {  
	            if(element.equals(kid))  
	                j++;  
	        }  
	        return j;  
	    }  

}
