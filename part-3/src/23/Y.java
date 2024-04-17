package com.abc;
import java.util.Arrays;
public class Y{
        public static void main(String[] args){
                String[] x = {
                                "hello","blue","yellow","white","pink",
                                "abc","java"
                                };
                Arrays.sort(x);
                System.out.println(Arrays.toString(x));
                int i = Arrays.binarySearch(x,"abc");
                System.out.println("abc:"+i);

                i = Arrays.binarySearch(x,"Orange");
                System.out.println("Orange:"+i);

                i = Arrays.binarySearch(x,"red");                
                System.out.println("red:"+i);
        }
}
