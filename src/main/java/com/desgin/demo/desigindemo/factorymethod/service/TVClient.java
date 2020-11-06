package com.desgin.demo.desigindemo.factorymethod.service;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 14:12
 * @Version 1.0
 */
public class TVClient {

    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        XMLUtil util = new XMLUtil();
        TVFactory factory = (TVFactory) util.getBean();
        TV tv = factory.produceTV();
        tv.play();
    }

}
