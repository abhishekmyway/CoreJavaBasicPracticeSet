package com.abc;
import java.util.TreeMap; import java.util.Comparator;
class C{
        int i,j;
        C(int i, int j){
                this.i = i;
                this.j = j;
        }
        public String toString(){
                return "("+i+","+j+")";
        }
        static class D implements Comparator{
                public int compare(Object o1 ,Object o2){
                        return ((C)o1).i-((C)o2).i;
                }
        }
        static class E implements Comparator{
                public int compare(Object o1 ,Object o2){
                        return ((C)o1).j-((C)o2).j;
                }
        }

}
