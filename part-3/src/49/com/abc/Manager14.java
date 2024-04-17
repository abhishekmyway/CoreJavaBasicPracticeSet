package com.abc;
import java.util.ArrayList;
public class Manager14 extends ArrayList{
        public static void main(String[] args){
                Manager14 list1 = new Manager14();
                list1.add(9);  list1.add(0);
                list1.add(4);  list1.add(6);
                list1.add(8);  list1.add(2);
                list1.add(1);  list1.add(3);


                System.out.println(list1);
                System.out.println("----");

                list1.removeRange(2,6);
                System.out.println(list1);
                       
        }
}
