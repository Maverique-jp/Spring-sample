package com.kazuki.hello.dao.impl;

import java.util.List;
import java.util.Properties;
import java.util.Map;

import com.kazuki.hello.dao.Studao;
import com.kazuki.hello.global.Student;

public class StuDaoImpl implements Studao {

    private String stuName;
    private int age;
    private float score;

    private List<String> stuList;
    private Map<String,Student> stuMap;
    private Properties prop;

    


    public void setStuList(List<String> stuList) {
        this.stuList = stuList;
    }

    public void setStuMap(Map<String, Student> stuMap) {
        this.stuMap = stuMap;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public void setStuName(String stuName){
        this.stuName = stuName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setScore(float score){
        this.score = score;
    }
    
    
    
    
    public void show(){
        System.out.println("学生の名前:"+stuName);
        System.out.println("学生の年齢:"+age);
        System.out.println("学生の成績:"+score);
        
        System.out.println("====================");

        System.out.println("list=" + stuList);
        System.out.println("map=" + stuMap);
        System.out.println("map=" + prop);
    }
}
