package com.abc;
import java.util.ArrayList;
import java.util.Collections;
public class Manager26{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(new F(9,5));
                list.add(new F(3,9));                
                list.add(new F(0,8));
                list.add(new F(1,0));
                list.add(new F(8,1));
                System.out.println(list);
                Collections.sort(list, new G());
                System.out.println(list);
                Collections.sort(list, new H());
                System.out.println(list);
        }
}
