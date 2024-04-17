package com.abc;
import java.util.HashSet;

class F{
        int i,j;
        F(int i, int j){
                this.i = i;
                this.j = j;
        }
        public String toString(){
                return "("+i+","+j+")";
        }
        public int hashCode(){
                String s1 = Integer.toString(i);
                String s2 = Integer.toString(j);
                int hash = s1.hashCode();
                hash += s2.hashCode();
                return hash;
        }
        public boolean equals(Object obj){
                return (obj instanceof F && i==((F)obj).i && j== ((F)obj).j);
        }
}        





