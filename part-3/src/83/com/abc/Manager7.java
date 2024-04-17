package com.abc;
public class Manager7{
        public static void main(String[] args){
                Stack s1 = new Stack();
                s1.add("abc");
                s1.add("xyz");
                s1.add("hello");
                s1.add(123);
                s1.add("done");
                System.out.println(s1);

                Object o1 = s1.processElement();
                System.out.println(o1);
                System.out.println(s1);
        }
}



