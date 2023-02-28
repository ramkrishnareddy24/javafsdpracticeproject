package javafsdpracticeproject;

public class AP38TryCatch {
	public static void main(String[] args) {
		int[] array = new int[3];
		try {
			array[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array Index out of Bounds Exception");
		}
		finally {
			System.out.println("The array is of size "+array.length);
			
		}
	}
}
