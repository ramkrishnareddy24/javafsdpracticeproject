package javafsdpracticeproject;

public class AP213Strings {
	public static void main(String[] args) {
		System.out.println("Methods of Strings");
		
		String s1 = new String("HelloWorld");
		System.out.println(s1.length());
		
		String s2 = new String("Welcome");
		System.out.println(s2.substring(2));
		
		String s3 = "Hello";
		String s4 = "Heldo";
		System.out.println(s3.compareTo(s4));
		
		String s5="";
		System.out.println(s5.isEmpty());
		
		String s6 = "Hello";
		System.out.println(s6.toLowerCase());
		
		String s7 = "Heldo";
		System.out.println(s7.replace('d', 'l'));
		
		String x = "HeLLo";
		String y = "hEllO";
		System.out.println(x.equals(y));
		
		
		System.out.println("\nStringBuffer");
		StringBuffer s = new StringBuffer("Welcome to Java ");
		s.append("Enjoy your learning");
		System.out.println(s);
		
		s.insert(0, 'w');
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEI");
		System.out.println(sb);
		
		s.delete(0, 1);
		System.out.println(sb);
		
		System.out.println("\nStringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy ");
		sb1.append("Learning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.insert(0, "Welcome"));
		
		System.out.println(sb1.reverse());
		
		System.out.println("\n Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("World");
		
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
		
	}
}
