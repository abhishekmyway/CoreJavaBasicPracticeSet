package com.abc;
import java.util.ArrayList; import java.util.ListIterator;
public class Manager36{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(90);  list.add(0);  list.add(40);
                ListIterator it = list.listIterator();
                while(it.hasNext()){
                        System.out.println(it.next()+",");
                }
                System.out.println();
                System.out.println("---");
                while(it.hasPrevious()){
                        System.out.println(it.previous()+",");
                }
                System.out.println();
                System.out.println("---");
                while(it.hasNext()){
                        System.out.print(it.next());
                }
                System.out.println();
                System.out.println("---");
        }
}

