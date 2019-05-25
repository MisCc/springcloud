package com.consumer.cn.controller;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class UserControllerMockitTest {

    @Test
    public void queryById() {
    }

    @Test
    public void default_fallbackMethod() {
        List<Integer> list=new ArrayList<Integer>();
        list.add(22);
        list.add(23);
        list.add(2);
        list.add(26);
        list.add(27);
        list.add(20);
        int len=list.size();
        for(int i=0;i<len/2;i++){
            Integer t1 = list.get(i);
            Integer t2 = list.get(len - i - 1);
            if(t1>t2){
                int tmp =t1;
                list.set(i, t2);
                list.set(len - i - 1, tmp);
            }
        }

        list.forEach(x->{
            System.out.println(x);
        });
    }
}