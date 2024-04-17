package com.abc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Manager18 {
        public static void main(String[] args){
                ArrayList list1 = new ArrayList();
                list1.add(9);  list1.add(0);
                list1.add(4);  list1.add(6);
                list1.add(8);  list1.add(2);
                list1.add(1);  list1.add(3);
                                            
                System.out.println(list1);
                System.out.println("----");

                Comparator ctr = Collections.reverseOrder();
                Collections.sort(list1,ctr);
                System.out.println(list1);
                       
        }
}
