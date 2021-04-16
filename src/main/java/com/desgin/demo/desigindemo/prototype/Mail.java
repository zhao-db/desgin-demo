package com.desgin.demo.desigindemo.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/3/15 11:17
 * @Version 1.0
 */
@Data
@ToString
public class Mail {

    private String name;

    private String emailAddress;

    private String content;

    public Mail() {
        System.out.println("Maill Class Contrsucter");
    }
}
