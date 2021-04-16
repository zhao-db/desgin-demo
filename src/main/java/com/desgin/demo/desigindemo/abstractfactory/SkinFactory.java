package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 15:50
 * @Version 1.0
 */
public interface SkinFactory {

    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();

}
