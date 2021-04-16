package com.desgin.demo.desigindemo.abstractfactory;

import com.desgin.demo.desigindemo.factorymethod.service.XMLUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 16:04
 * @Version 1.0
 */
public class SkinClient {

    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        XMLUtil util = new XMLUtil();
        SkinFactory bean = (SkinFactory) util.getBean();
        bean.createButton().display();
        bean.createComboBox().display();
        bean.createTextField().display();
    }

}
