package com.abc;
import java.util.Arrays;
public class Manager5 {
	public static void main(String[] args) {
		int [] x = {10,30,15,40,20};
		Integer[] y = {new Integer(9), 19, 20, new Integer(15)};
		String[] z = {"xyz",new String("abc"), "lara", "java"};
		D[] p = {new D(9),new D(19), new D(15),new D(5)};
		System.out.print(Arrays.toString(x));
		Arrays.sort(x);
		System.out.print(Arrays.toString(x));
		System.out.print("----");
		System.out.print(Arrays.toString(y));
		Arrays.sort(y);
		System.out.print(Arrays.toString(y));
		System.out.print("----");
		System.out.print(Arrays.toString(z));
		Arrays.sort(z);
		System.out.print(Arrays.toString(z));
		System.out.print("----");
		System.out.print(Arrays.toString(p));
		Arrays.sort(p);
		System.out.print(Arrays.toString(p));
		System.out.print("----");
	}
}
