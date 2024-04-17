package com.abc;
import java.util.Enumeration;
import java.util.Vector;

public class Manager1{
        public static void main(String[] args){
                Vector v1 = new Vector();
                v1.add(90);  v1.add(9);
                v1.add(0);   v1.add(40);
                System.out.println(v1);

                Enumeration enum1 = v1.elements();
                while(enum1.hasMoreElements()){
                        System.out.println(enum1.nextElement());
                }
        }

}
        

