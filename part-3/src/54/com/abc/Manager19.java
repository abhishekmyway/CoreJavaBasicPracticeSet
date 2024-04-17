package com.abc;
import java.util.ArrayList;
import java.util.Collections;
public class Manager19 {
        public static void main(String[] args){
                ArrayList list1 = new ArrayList();
                list1.add(8.9);  
                list1.add(9);
                list1.add(9.0);
                list1.add(9.1);
                                            
                System.out.println(list1);
                System.out.println("----");

                Collections.sort(list1);
                System.out.println(list1);
                       
        }
}
