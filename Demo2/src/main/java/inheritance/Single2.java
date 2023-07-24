package inheritance;

public class Single2 extends Single1
{
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args)
	{
		Single2 obj=new Single2();
		obj.eat();
		obj.run();
	}
}
