package javafsdpracticeproject;

public class AP39CustomException {
	
	void Division() throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is :"+rs);
	}
	
	public static void main(String[] args) {
		int a=45,b=0,rs;
		
		AP39CustomException T = new AP39CustomException();
		
		try {
			
			T.Division();
			
			if(b==0)
				throw(new ArithmeticException("Cant divide by zero"));
			else {
				rs=a/b;
				System.out.println("The result is "+rs);
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("\n\tError :"+ae.getMessage());
		}
		finally {
			System.out.println("\n\tEnd of Program.");
		}
	}
}


