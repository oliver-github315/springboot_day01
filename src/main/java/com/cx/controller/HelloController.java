package com.cx.controller;

import com.cx.entity.Student;
import com.cx.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/hello")
//@Import(Student.class)
public class HelloController {

    @Autowired
    private Student student;

    @Value("${uname}")
    private String name;

    @Value("${datetime}")
    private Date date;

    @Value("${strs}")
    private String[] strs;

    @Value("${slist}")
    private List<String> slist;

    @Value("#{${map}}")
    private Map<String,String>  maps;

    @Autowired
    private Teacher teacher;

    @ResponseBody
    @RequestMapping("hello")
    public String sayHello(){
        System.out.println(student);
        System.out.println(name);
        System.out.println(date);
        for (String str : strs) {
            System.out.println(str);
        }
        slist.forEach(System.out::println);
//        slist.forEach(s -> System.out.println(s));
        System.out.println("--------");
        maps.forEach((k,v)-> System.out.println(k+":   "+v));
        Set<String> strings = maps.keySet();
        for (String string : strings) {
            System.out.print(string+"--");
            System.out.println(maps.get(string));
        }
        System.out.println("--------");
        System.out.println(teacher);
        return "hello spring boot!!";
    }

    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("findAll");
        model.addAttribute("name", "小王");
        model.addAttribute("uame", "<a href=''>小赵</a>");
        model.addAttribute("user", new Teacher(11,"美女",new Date()));
        return "index";
    }
}
