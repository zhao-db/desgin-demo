package com.desgin.demo.desigindemo.factorymethod.service;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 14:14
 * @Version 1.0
 */
public class XMLUtil {

    public Object getBean() throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document doc;
        doc = documentBuilder.parse(new File("D:\\ideaProjects\\zdbProject\\desgin-demo\\src\\main\\resources\\config.xml"));
        NodeList className = doc.getElementsByTagName("className");
        Node classNode = className.item(0).getFirstChild();
        String cName = classNode.getNodeValue();
        Class c = Class.forName(cName);
        Object obj = c.newInstance();
        return obj;
    }

}
