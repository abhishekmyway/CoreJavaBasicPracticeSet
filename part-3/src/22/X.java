package com.abc;
import java.util.Arrays;
public class X{
        public static void main(String[] args){
                int[] x = {10,20,30,40,4,25};
                Arrays.sort(x);
                System.out.println(Arrays.toString(x));

                int i = Arrays.binarySearch(x,4);
                System.out.println(i);

                i = Arrays.binarySearch(x,1);
                System.out.println(i);

                i = Arrays.binarySearch(x,24);
                System.out.println(i);

                i = Arrays.binarySearch(x,40);
                System.out.println(i);
        }
}
