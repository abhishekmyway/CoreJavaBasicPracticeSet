
package com.abc;
import java.util.ArrayList;
import java.util.Collections;
public class Manager29{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(20);
                list.add(10);
                list.add(30);
                list.add(23);
                list.add(49);
                list.add(15);

                System.out.println(Collections.max(list));
                System.out.println(Collections.min(list));
                
        }
}

