package com.abc;
import java.util.Comparator;
class C implements Comparator{
                public int compare(Object o1, Object o2){
                        return ((B)o1).i - ((B)o2).i;
                }                     
}
