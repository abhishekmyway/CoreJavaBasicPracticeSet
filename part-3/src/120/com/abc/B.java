package com.abc;
import java.util.TreeMap;
class B implements Comparable{
        int i;
        B(int i){
                this.i = i;
        }
        public String toString(){
                return "(i="+i+")";
        }
        public int compareTo(Object obj){
                return i-((B)obj).i;
        }
}
