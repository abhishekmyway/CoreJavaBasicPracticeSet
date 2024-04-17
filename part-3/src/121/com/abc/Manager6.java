package com.abc;
import java.util.TreeMap; import java.util.Comparator;
public class Manager6{
        public static void main(String[] args){
                TreeMap map1 = new TreeMap(new C.D());
                map1.put(new C(9,1),9);
                map1.put(new C(0,10),19);
                map1.put(new C(1,8),92);
                map1.put(new C(8,0),91);
                map1.put(new C(5,4),39);
                System.out.println(map1);

                TreeMap map2 = new TreeMap(new C.E());
                map2.put(new C(9,1),9);
                map2.put(new C(0,10),19);
                map2.put(new C(1,8),92);
                map2.put(new C(8,0),91);
                map2.put(new C(5,4),39);
                System.out.println(map2);

        }
}

