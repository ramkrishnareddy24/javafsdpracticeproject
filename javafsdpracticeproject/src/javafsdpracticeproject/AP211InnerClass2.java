package javafsdpracticeproject;

public class AP211InnerClass2 {
	private String msg = "Inner Classes";
	
	void display() {
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner i = new Inner();
		i.msg();
	}
	
	public static void main(String[] args) {
		AP211InnerClass2 ob = new AP211InnerClass2();
		ob.display();
	}
}
