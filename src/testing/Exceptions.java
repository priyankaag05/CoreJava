package testing;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {9,4,8};
		try {
		System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("inside catch block");
		}
		System.out.println("after catch");
	}

}
