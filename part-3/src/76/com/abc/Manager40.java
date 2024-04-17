package com.abc;
import java.util.ArrayList;
import java.util.ListIterator;

public class Manager40{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(90);  list.add(9);
                list.add(0);   list.add(40);
                ListIterator it = list.listIterator();
                while(it.hasNext()){
                        Object obj = it.next();
                        if(obj.equals(9)){
                                it.set("abc");
                        }
                        System.out.print(obj+",");
                }
                System.out.println();
                System.out.println(list);
        }
}
        

