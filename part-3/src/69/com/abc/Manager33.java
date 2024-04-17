package com.abc;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager33{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(9); list.add(4);
                list.add(5); list.add(0);
                list.add(2);
                System.out.println(list);
                System.out.println("---");
                Iterator it = list.iterator();
                while(it.hasNext()){
                        Object obj = it.next();
                        System.out.println(obj);
                        if(obj.equals(9)){
                             it.remove();
                        }
                }
                System.out.println(list);
       }
}
