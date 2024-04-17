package com.abc;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager35{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(9); list.add(4);
                list.add(5); list.add(0);
                list.add(2);
                Iterator it = list.iterator();
                while(it.hasNext()){
                      System.out.println(it.next());
                }
                list.add(50);
                System.out.println(list);
       }
}
