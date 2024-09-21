package com.kazuki.hello.dao.impl;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

import com.kazuki.hello.dao.Studao;

public class StuDaoImpl implements Studao {
    public void show(){
        List<Integer> list = Arrays.asList(1,2,3,5,6,32);

        Stream<Integer> stream = list.stream();

        stream.forEach(n -> System.out.println(n + " "));
    }
}
