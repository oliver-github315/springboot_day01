package com.cx.entity;

import org.springframework.context.annotation.Configuration;


/**
 *   在springboot中提供两种方式配置class 通过springboot 管理自定义java class
 *      a.java config  java配置 自定义java对象管理     [推荐]
 *          @Configuration 注解类似于@Component注解  多个自定义对象管理  [推荐]
 *          @import        注解导入一个配置类         导入指定对象,哪里调用哪里用
 *      b.xml方式配置   通过xml配置管理java对象         [了解]
 *          @ImportResource("spring.xml")
 */

//@Configuration//自定义Java类
public class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
