package com.codegnan.ExceptionHandling;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			int[] num = {1,2,3};
			int index  = num[5];
			int res = 10/0;
			String text = null;
			int length = text.length();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Error : "+e.getMessage());
//		}catch(ArithmeticException e) {
//			System.out.println("Arithmetic Error: "+e.getMessage());
//		}catch(NullPointerException e) {
//			System.out.println("Null Pint Error : "+e.getMessage());
//		}
			
			// singleline multi catch
			}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
				e.getStackTrace();
			}
			catch(Exception e) {
			System.out.println("General Error "+e.getMessage());
		}
		
	}
}
