package javafsdpracticeproject;

public class AP15AccessModifierPrivate {
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		privateAccessSpecifier pas = new privateAccessSpecifier();
//		pas.display();
	}
}

class privateAccessSpecifier{
	private void display() {
		System.out.println("Youre using private access specifier");
	}
}
