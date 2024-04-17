package com.abc;
import java.util.HashSet;

public class Manager20{
        public static void main(String[] args){
                HashSet set = new HashSet();
                set.add(new F(1,2));
                set.add(new F(2,1));
                System.out.println(set);
        }       
}
