package javafsdpracticeproject;

public class AP310ExceptionHandlers {
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new MyException("This is My Error Message");
		}
		catch(MyException e) {
			System.out.println("catch Block");
			System.out.println(e);
		}
	}
}

class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1=str2;
	}
	
	public String toString() {
		return ("MyException Occurred :"+str1);
	}
}
