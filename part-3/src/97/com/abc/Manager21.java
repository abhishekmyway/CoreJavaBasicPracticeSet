package com.abc;
import java.util.HashSet;

public class Manager21{
        public static void main(String[] args){
                HashSet list = new HashSet();
                list.add(new G(1,1));
                list.add(new G(1,1));
                list.add(new G(1,2));
                list.add(new G(2,1));
                System.out.println(list);
        }       
}
