package com.abc;
import java.util.ArrayList;
import java.util.Collections;
public class Manager25{
        public static void main(String[] args){
                ArrayList list = new ArrayList();
                list.add(new E(9,5));
                list.add(new E(3,9));                
                list.add(new E(0,8));
                list.add(new E(1,0));
                list.add(new E(8,1));
                System.out.println(list);
                Collections.sort(list);
                System.out.println(list);
        }
}
