package inheritance;

public class High3 extends High1
{
	public void climb()
	{
		System.out.println("Jumbing");
	}
	public static void main(String[] args) 
	{
		High3 obj=new High3();
		obj.run();
		obj.climb();
		High2 obj2=new High2();
		obj2.run();
		obj2.bark();
	}
}