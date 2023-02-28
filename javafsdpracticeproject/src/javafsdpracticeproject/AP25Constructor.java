package javafsdpracticeproject;

public class AP25Constructor {
	public static void main(String[] args) {
		Emp e = new Emp();
//		e.display();
		
		Stu s = new Stu(10,"Alex");
		s.display();
	}
}

//default Constructor
class Emp{
	int id;
	String name;
	
	void display() {
		System.out.println("EName "+name);
		System.out.println("Eid "+id);
	}
}

//Parameter Constructor
class Stu{
	int id;
	String name;
	
	Stu(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("SName :"+name);
		System.out.println("Sid :"+id);
	}
}
