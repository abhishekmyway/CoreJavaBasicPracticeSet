package com.abc;

import java.util.Arrays;

public class Manager6 {
	public static void main(String[] args) {
		E[] x = {
					new E(1,2), new E(2,0), 
					new E(0,1), new E(5,9), new E(3,4)
				};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}

