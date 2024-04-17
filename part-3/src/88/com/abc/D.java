package com.abc; import java.util.Comparator;
class D implements Comparator{
        public int compare(Object o1, Object o2){
                return ((B)o1).j - ((B)o2).j;
        }
}


