package javafsdpracticeproject;

abstract class AnonymousInnerClass{
	public abstract void display();
}

public class AP211AnonymousClass {
	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("AnonymousInnerClass");
			}
		};
		i.display();
	}
}
