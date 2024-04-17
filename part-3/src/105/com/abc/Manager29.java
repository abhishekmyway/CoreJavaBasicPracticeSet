package com.abc;
import java.util.Comparator;
import java.util.TreeSet;
public class Manager29{
        public static void main(String[] args){
		TreeSet set1 = new TreeSet(new L.A());
                TreeSet set2 = new TreeSet(new L.B());

                set1.add(new L(1,0));
                set1.add(new L(2,1));
                set1.add(new L(0,4));
                set1.add(new L(5,2));
                set1.add(new L(4,3));

                System.out.println(set1);

		set2.add(new L(1,0));
                set2.add(new L(2,1));
                set2.add(new L(0,4));
                set2.add(new L(5,2));
                set2.add(new L(4,3));
                System.out.println(set2);

        }       
}
