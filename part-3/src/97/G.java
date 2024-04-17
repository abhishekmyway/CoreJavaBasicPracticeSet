package com.abc;
import java.util.HashSet;
class G{
        int i,j;
        G(int i, int j){
                this.i = i;
                this.j = j;
        }
        public String toString(){
               return "("+i+","+j+")";
        }
        public int hashCode(){
                System.out.println("hash Code");
                String s1 = Integer.toString(i);
                String s2 = Integer.toString(j);
                int hash = s1.hashCode();
                hash += s2.hashCode();
                return hash;
        }
        public boolean equals(Object obj){
                System.out.println("equals");
                return (obj instanceof G && i==((G)obj).i && j== ((G)obj).j);
        }
}        





