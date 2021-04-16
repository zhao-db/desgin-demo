package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 15:52
 * @Version 1.0
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
