package javafsdpracticeproject;

public class AP23Methods {
	
	public static void main(String[] args) {
		methodExecution m = new methodExecution();
		int res = m.multiply(2, 3);
		System.out.println(res);
		
		methodOverloading mO = new methodOverloading();
		mO.add(2, 3);
		mO.add(2, 3, 4);
		
	}
	
}

class methodExecution{
	public int multiply(int a,int b)
	{
		int z = a*b;
		return z;
	}
}

class methodOverloading{
	void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Add 2 Int "+res);
	}
	
	void add(float a,float b)
	{
		float res = a+b;
		System.out.println("Add 2 Float "+res);
	}
	
	void add(int a,int b,int c)
	{
		int res = a+b+c;
		System.out.println("Add 3 Int "+res);
	}
}
