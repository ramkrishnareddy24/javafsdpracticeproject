package javafsdpracticeproject;

public class AP211InnerClasses {
	private String msg = "Welcome to Java";
	
	class Inner{
		void hello() {
			System.out.println(msg+" Let us start learning Inner Classes");
		}
	}
	
	public static void main(String[] args) {
		AP211InnerClasses obj = new AP211InnerClasses();
		AP211InnerClasses.Inner in = obj.new Inner();
		in.hello();
	}
}
