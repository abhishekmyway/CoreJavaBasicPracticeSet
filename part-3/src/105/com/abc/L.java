package com.abc; import java.util.Comparator;
import java.util.TreeSet;
class L{
        int i,j;
        L(int i, int j){
                this.i = i;
                this.j = j;
        }
        public String toString(){
               return "("+i+","+j+")";
        }
	static class A implements Comparator
	{
		public int compare(Object o1, Object o2){
		L obj1 = (L)o1;
		L obj2 = (L)o2;
		return obj1.i - obj2.i;
		}
	}
	static class B implements Comparator
	{
		public int compare(Object o1, Object o2){
		L obj1 = (L)o1;
		L obj2 = (L)o2;
		return obj1.j - obj2.j;
		}
	}
}        





