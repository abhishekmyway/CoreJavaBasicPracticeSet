package com.abc;

import java.util.Comparator;

public class H implements Comparator{
	public int compare(Object o1, Object o2){
		F f1 = (F)o1;
		F f2 = (F)o2;
		return f1.j-f2.j;
	}
}
