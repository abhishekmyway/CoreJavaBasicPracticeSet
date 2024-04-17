package com.abc; import java.util.HashSet;
import java.util.TreeSet;
class K implements Comparable{
        int x;
        K(int x){
                this.x = x;
        }
        public String toString(){
               return "x =" +x;
        }
        public int compareTo(Object obj){
                return x - ((K)obj).x;
        }
        
}        





