package com.abc;
import java.util.TreeMap;
class D implements Comparable{
        int i;
        D(int i){
                this.i = i;
        }
        public String toString(){
                return "( i ="+i+")";
        }
        public int hashCode(){
                return Integer.toString(i).hashCode();
        }
        public boolean equals(Object obj){
                return i == ((D)obj).i;
        }
        public int compareTo(Object obj){
                return i - ((D)obj).i;
        }

        

}
