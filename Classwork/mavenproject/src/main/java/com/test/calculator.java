package com.test;

public class calculator {
		public int Addition(int a,int b) {
			return a+b;
		}
		public int subtraction(int a,int b) {
			return a-b;
		}
		public int multiplication(int a , int b) {
			return a*b;
		}
		public int factorial(int n) {
			int i,f=1;
			for(i=1;i<=n;i++) {
				f =f*i;
			}
			return f;
		}
}
