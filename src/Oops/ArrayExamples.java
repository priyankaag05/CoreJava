package Oops;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {10,20,30,40,50};
		System.out.println("total number are " + array1.length);
		System.out.println("Second number is " + array1[1]);
		System.out.println("last number is " +array1[array1.length-1]);
		
		String str1="Clean world Green World";
		String[] array3 =str1.split(" ");
	    System.out.println("first word is " + array3[1]);
	}

}
