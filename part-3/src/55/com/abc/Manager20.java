package com.abc;
import java.util.ArrayList;
import java.util.Collections;
public class Manager20 {
        public static void main(String[] args){
                ArrayList list1 = new ArrayList();
                list1.add("abc");  
                list1.add("aBC");
                list1.add("abc");
                list1.add("ABc");
                list1.add("123");

                System.out.println(list1);
                System.out.println("----");

                Collections.sort(list1);
                System.out.println(list1);
                       
        }
}
