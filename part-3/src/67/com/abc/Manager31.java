package com.abc;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager31{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(9); list.add(4);
                list.add(5); list.add(0);
                list.add(2);
                System.out.println(list);
                System.out.println("---");
                Iterator it = list.iterator();
                while(it.hasNext()){
                        System.out.print(it.next()+",");
                }
                System.out.println();
                System.out.println("----");
                while(it.hasNext()){
                        System.out.print(it.next()+",");
                }
        }
}
