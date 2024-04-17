package com.abc;
import java.util.HashSet;

public class Manager22{
        public static void main(String[] args){
                HashSet list = new HashSet();
                list.add(new I(1,2));
                list.add(new I(1,3));
                list.add(new I(1,5));
                list.add(new I(2,1));
                System.out.println(list.size());
        }       
}
