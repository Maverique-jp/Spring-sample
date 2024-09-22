package com.kazuki.hello.global;

public class Student {
    private String name;
    private int age;
    private float score;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setScore(float score){
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age , float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString(){
        return "Student{"+
            "name='"+name + '\''+
            ",age=" + age+
            ",score=" + score + 
            '}';
    }


}
