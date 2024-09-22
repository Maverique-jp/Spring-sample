package com.kazuki.hello.service.impl;

import com.kazuki.hello.dao.Studao;
import com.kazuki.hello.service.StuService;
import java.util.List;

import java.util.stream.Stream;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {

    // Autowire StuDao via setter method
    private Studao stuDao = null;

    // @Autowired
    // public void setStuDao(Studao stuDao) {
    //     this.stuDao = stuDao;
    // }

    public StuServiceImpl(Studao stuDao){
    this.stuDao = stuDao;
    }

    public StuService(){
        
    }

    @Override
    public void show() {
        
        List<Integer> list = Arrays.asList(1,2,3,5,6,32);

        Stream<Integer> stream = list.stream();

        stream.forEach(n -> System.out.println(n + " "));
    }
}
