package com.abc;
import java.util.HashMap;
public class Manager37{
        public static void main(String[] args){
                HashMap map = new HashMap();
                map.put(10,"abc");      map.put(10,"xyz");
                map.put("k1",200);      map.put("k1","test");
                map.put(new M(10),100); map.put(new M(10),200);
                System.out.println(map);
        }
}


