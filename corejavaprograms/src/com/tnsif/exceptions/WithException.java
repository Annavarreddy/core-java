package com.tnsif.exceptions;
//program to demonstarte try catch
public class WithException {

	public static void divide() {
		int a=6,b=0,c;
		try {//exception is raised
			c =a/b;
		}
		catch(ArithmeticException e) {//exception is handled and e is object of exception
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception caught"+e.getMessage());
		} 
		finally {
			System.out.println("this will be executed");
		}
		}
			

	}


