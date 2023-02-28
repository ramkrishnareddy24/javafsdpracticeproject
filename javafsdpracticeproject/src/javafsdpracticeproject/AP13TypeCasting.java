package javafsdpracticeproject;

public class AP13TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Typecasting");
		char a = 'A';
		System.out.println("Value of a :"+a);
		
		int b = a;
		System.out.println("Value of b :"+b);
		
		float c = a;
		System.out.println("Value of c :"+c);
		
		long d = a;
		System.out.println("Value of d :"+d);
		
		double e =a;
		System.out.println("Value of e :"+e);
		
		System.out.println();
		
		System.out.println("Explicit Conversion");
		
		double x = 4.45;
		int y = (int)x;
		System.out.println("Value of y :"+y);
	}

}
