package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 16:07
 * @Version 1.0
 */
public class ZdbSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new ZdbButton();
    }

    @Override
    public TextField createTextField() {
        return new ZdbTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new ZdbComboBox();
    }
}
