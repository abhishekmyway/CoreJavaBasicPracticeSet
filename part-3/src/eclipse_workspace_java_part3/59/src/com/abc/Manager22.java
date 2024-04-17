package com.abc;
import java.util.ArrayList;
public class Manager22{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add("abc");
                list.add(new B(9));
                list.add(new B(4));
                list.add(new B(5));
                list.add(new B(2));
                System.out.println(list);
        }
}
