package com.abc;
import java.util.TreeMap;

public class Manager4{
        public static void main(String[] args){
                TreeMap map1 = new TreeMap();
                map1.put(new A(9),"abc");
                map1.put(new A(90),"abc1");
                map1.put(new A(5),"abc2");
                System.out.println(map1);
        }
}

