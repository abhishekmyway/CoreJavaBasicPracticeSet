package com.abc;
public class Manager6{
        public static void main(String[] args){
                Queue q1 = new Queue();
                q1.add("abc");
                q1.add("xyz");
                q1.add("hello");
                q1.add(123);
                q1.add("done");
                System.out.println(q1);

                Object o1 = q1.processElement();
                System.out.println(o1);
                System.out.println(q1);
        }
}



