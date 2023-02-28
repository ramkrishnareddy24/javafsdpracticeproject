package javafsdpracticeproject;

public class AP15AccessModifierDefault {
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier defA = new defAccessSpecifier();
		defA.display();
	}
}

class defAccessSpecifier{
	void display() {
		System.out.println("Youre using default access specifier");
	}
}
