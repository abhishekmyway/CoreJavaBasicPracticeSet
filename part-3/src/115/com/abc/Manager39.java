package com.abc;   import java.util.HashMap;
public class Manager39{
        public static void main(String[] args){
                HashMap map = new HashMap();
                map.put(90,"e1");      map.put(90,"e2");
                map.put("abc","v1");      map.put("abc","v2");
                map.put(new P(9),"hello1"); map.put(new P(9),"hello2");
                map.put(new Q(9),"hello3"); map.put(new Q(9),"hello4");
                map.put(new StringBuffer("abc"),"hello4");
                map.put(new StringBuffer("abc"),"hello5");
                System.out.println(map);
        }
}


