package com.abc;
import java.util.TreeMap;
public class Manager7{
        public static void main(String[] args){
                TreeMap map1 = new TreeMap();
                map1.put(new D(9),"abc1");
                map1.put(new D(9),"abc2");
                map1.put(new D(9),"abc3");
                map1.put(new D(90),"abc4");
                map1.put(new D(0),"abc5");
                map1.put(new D(80),"abc6");
                System.out.println(map1);

        }
}

