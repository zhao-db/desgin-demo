package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 15:52
 * @Version 1.0
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
