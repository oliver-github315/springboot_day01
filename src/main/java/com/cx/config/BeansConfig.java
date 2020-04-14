package com.cx.config;

import com.cx.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {

    @Bean//(name = "student") //默认将当前方法的返回值注入容器,id默认是返回值首字母小写
//    @Scope(scopeName = "prototype")prototype多例  默认单例
    public Student getStudent(){
        return new Student();
    }
}
