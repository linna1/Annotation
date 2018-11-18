package com.linna.myannotation.pojo;

import lombok.Data;


@Data
public class BeanDefine {

    private String id;

    private String className;

    public BeanDefine(String id, String className) {
        this.id = id;
        this.className = className;
    }
}
