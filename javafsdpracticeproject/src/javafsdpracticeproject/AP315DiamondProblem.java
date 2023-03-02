package javafsdpracticeproject;

public class AP315DiamondProblem implements First,Second{
	
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 

	
	public static void main(String[] args) {
		AP315DiamondProblem ob = new AP315DiamondProblem(); 
        ob.show(); 
	}
}

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  

