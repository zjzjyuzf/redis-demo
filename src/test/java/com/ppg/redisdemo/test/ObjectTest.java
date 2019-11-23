package com.ppg.redisdemo.test;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectTest {

    public static void main(String[] args) {




    }

    //操作String对象
    public void operateString(String str){
//        str.replace('j','k');
        str = new String("kobe bryant");
        //String 的值无法改变
    }

    //操作list
    public void operateList(List list){
        list.set(0, "ret2");
    }
    //操作map
    public void operateMap(Map map) {
        map.put("k3","ret3");
    }
    //操作arr
    public void operateArr(Object[] arr) {
        Map map = (Map) arr[2];
        map.put("k4", "ret4");
    }

    //test
    @Test
    public void test() {

        String t1 = new String("james harden");

        List<String> t2 = new ArrayList<>();
        t2.add("qwer1");
        t2.add("qwer2");
        t2.add("qwer3");
        t2.add("qwer4");

        Map<String, String> t3 = new HashMap<>();
        t3.put("k1", "v1");
        t3.put("k2", "v2");
        t3.put("k3", "v3");
        t3.put("k4", "v4");

        Object[] t4 = new Object[]{t1,t2,t3};

        System.out.println("操作前");
        System.out.println(JSONObject.toJSONString(t1));
        operateString(t1);
        System.out.println("操作后");
        System.out.println(JSONObject.toJSONString(t1));
        System.out.println("操作前");
        System.out.println(JSONObject.toJSONString(t2));
        operateList(t2);
        System.out.println("操作后");
        System.out.println(JSONObject.toJSONString(t2));
        System.out.println("操作前");
        System.out.println(JSONObject.toJSONString(t3));
        operateMap(t3);
        System.out.println("操作后");
        System.out.println(JSONObject.toJSONString(t3));
        System.out.println("操作前");
        System.out.println(JSONObject.toJSONString(t4));
        operateArr(t4);
        System.out.println("操作后");
        System.out.println(JSONObject.toJSONString(t4));

    }

}
