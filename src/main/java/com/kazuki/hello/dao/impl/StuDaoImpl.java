package com.kazuki.hello.dao.impl;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

import com.kazuki.hello.dao.Studao;

public class StuDaoImpl implements Studao {

    private String stuName;
    private int age;
    private float score;

    public void setName(String stuName){
        this.stuName = stuName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setScore(float stuName){
        this.score = score;
    }
    
    
    
    
    public void show(){
        System.out.println("学生の名前:"+stuName);
        System.out.println("学生の年齢:"+age);
        System.out.println("学生の成績:"+score);
    }
}
