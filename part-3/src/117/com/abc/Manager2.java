package com.abc;
import java.util.HashMap;
import java.util.TreeMap;

public class Manager2{
        public static void main(String[] args){
                TreeMap map1 = new TreeMap();
                map1.put("key",2000);
                map1.put("abc",2300);
                map1.put("hello",2050);
               // map1.put(12,"abc");
                map1.put(12,"xyz");
                map1.put(1,"test");
                map1.put(2,9);
               // map1.put(0,3);
                map1.put(5,2);
                System.out.println(map1);
        }
}

